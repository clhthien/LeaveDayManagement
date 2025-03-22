package APlus.LeaveDayManagement.response;

import APlus.LeaveDayManagement.response.UserDTO.UserDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import APlus.LeaveDayManagement.model.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse{
    int status;
    String message;

    UserDTO userDTO;

    User user;

}
