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
        ApiResponse response = new ApiResponse();
        try {
            if (userRepository.existsByEmail(request.getEmail())) {
                throw new OurException("Email is already in use");
            }
            User user = new User();
            user.setRole("EMPLOYEE");
            user.setEmail(request.getEmail());
            user.setName(request.getName());
            user.setPassword(request.getPassword());
//            user.setLeaveDays(request.getLeaveDays());
            userRepository.save(user);

            response.setStatus(200);
            response.setMessage("User added successfully");

        } catch (Exception e) {
            response.setStatus(400);
            response.setMessage(e.getMessage());
        }
        return response;
    }

//    @Override
//    public ApiResponse<User> updateUser(UserDTO userDTO) {
//        return null;
//    }
}
