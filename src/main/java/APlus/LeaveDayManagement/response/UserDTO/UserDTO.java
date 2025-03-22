package APlus.LeaveDayManagement.response.UserDTO;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Data
public class UserDTO {
    Long id;
    String name;
    String email;
    String password;
//    int leaveDays;
}
