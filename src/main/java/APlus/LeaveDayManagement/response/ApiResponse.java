package APlus.LeaveDayManagement.response;

import APlus.LeaveDayManagement.model.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApiResponse{
    int status;
    String message;
    User user;
}
