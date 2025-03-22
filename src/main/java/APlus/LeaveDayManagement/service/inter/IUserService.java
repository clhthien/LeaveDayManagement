package APlus.LeaveDayManagement.service.inter;

import APlus.LeaveDayManagement.model.User;
import APlus.LeaveDayManagement.response.ApiResponse;
import APlus.LeaveDayManagement.response.UserDTO.UserDTO;

public interface IUserService {
    public ApiResponse addUser(UserDTO request);
    public ApiResponse updateUser(UserDTO userDTO);
    public ApiResponse deleteUser(long id);
    public ApiResponse viewUser(Long id);
}
