package APlus.LeaveDayManagement.controller;

import APlus.LeaveDayManagement.response.ApiResponse;
import APlus.LeaveDayManagement.response.UserDTO.UserDTO;
import APlus.LeaveDayManagement.service.inter.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;

    public ResponseEntity<ApiResponse> addUser (UserDTO request) {
        ApiResponse response = userService.addUser(request);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

}
