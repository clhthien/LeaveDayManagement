package APlus.LeaveDayManagement.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    long id;
    String name;
    String email;
    String password;
    String role;
    int leaveDays;
    List<Long> mangerIds;
}
