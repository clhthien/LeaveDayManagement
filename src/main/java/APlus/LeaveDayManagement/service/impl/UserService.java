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

    @Override
    public ApiResponse addUser(UserDTO request) {
        return null;
    }

    @Override
    public ApiResponse viewUser(Long id) {

        try {
            User user = userRepository.findById(id).orElse(null);

            if (user == null) {
                throw new OurException("User not found");
            }

            UserDTO userDTO = UserDTO.builder()
                    .id(user.getId())
                    .email(user.getEmail())
                    .name(user.getName())
                    .build();

            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setUserDTO(userDTO);
            apiResponse.setStatus(200);
            apiResponse.setMessage("User found");

            return apiResponse;

        } catch (OurException e) {
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setStatus(404);
            apiResponse.setMessage(e.getMessage());
            return apiResponse;
        }
    }

    @Override
    public ApiResponse updateUser(UserDTO userDTO) {
        return null;
    }
}
