package APlus.LeaveDayManagement.response.UserDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
    long id;
    String name;
    String email;
    String password;
//    int leaveDays;
}
