package APlus.LeaveDayManagement.response;

import APlus.LeaveDayManagement.model.User;
import APlus.LeaveDayManagement.response.UserDTO.UserDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse{
    int status;
    String message;

    User user;
    UserDTO userDTO;
    List<UserDTO> userDTOList;
}
