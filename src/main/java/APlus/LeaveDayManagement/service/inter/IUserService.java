package APlus.LeaveDayManagement.service.inter;

import APlus.LeaveDayManagement.response.ApiResponse;
import APlus.LeaveDayManagement.response.UserDTO.UserDTO;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    public ApiResponse addUser(UserDTO request);
    public ApiResponse updateUser(UserDTO userDTO);
    public ApiResponse deleteUser(long id);
    public ApiResponse viewUser(Long id);
    public ApiResponse viewAllUser(Pageable pageable);
}
