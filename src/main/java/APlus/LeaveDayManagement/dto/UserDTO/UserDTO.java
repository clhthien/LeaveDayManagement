package APlus.LeaveDayManagement.dto.UserDTO;

import lombok.Data;

@Data
public class UserDTO {
    String name;
    String email;
    String password;
    int leaveDays;
}
