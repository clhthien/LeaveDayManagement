package APlus.LeaveDayManagement.service.inter;

import APlus.LeaveDayManagement.response.ApiResponse;
import APlus.LeaveDayManagement.response.UserDTO.UserDTO;

public interface IUserService {
    public ApiResponse addUser(UserDTO request);

    public ApiResponse viewUser(Long id);
    public ApiResponse updateUser(UserDTO userDTO);
}
