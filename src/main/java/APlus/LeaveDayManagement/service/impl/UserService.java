package APlus.LeaveDayManagement.service.impl;

import APlus.LeaveDayManagement.exception.OurException;
import APlus.LeaveDayManagement.model.User;
import APlus.LeaveDayManagement.repository.UserRepository;
import APlus.LeaveDayManagement.response.ApiResponse;
import APlus.LeaveDayManagement.response.UserDTO.UserDTO;
import APlus.LeaveDayManagement.service.inter.IUserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService implements IUserService {
    UserRepository userRepository;
//    UserMapper userMapper;

    @Override
    public ApiResponse addUser(UserDTO request) {
        try {
            if (userRepository.existsByEmail(request.getEmail())) {
                throw new OurException("Email is already in use");
            }
            User user = new User();
            user.setEmail(request.getEmail());
            user.setName(request.getName());
            user.setPassword(request.getPassword());
            user.setLeaveDays(request.getLeaveDays());
            userRepository.save(user);

            return ApiResponse.builder()
                    .status(200)
                    .message("User added successfully")
                    .build();
        } catch (Exception e) {
            return ApiResponse.builder()
                    .status(400)
                    .message(e.getMessage())
                    .build();
        }
    }

    @Override
    public ApiResponse<User> updateUser(UserDTO userDTO) {
        return null;
    }
}
