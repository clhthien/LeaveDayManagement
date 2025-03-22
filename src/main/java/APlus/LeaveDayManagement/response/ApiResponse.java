package APlus.LeaveDayManagement.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ApiResponse<T> {
    private final int status;
    private final String message;
    private final T data;
}
