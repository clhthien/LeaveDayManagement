package APlus.LeaveDayManagement.controller;

import APlus.LeaveDayManagement.model.User;
import APlus.LeaveDayManagement.response.ApiResponse;
import APlus.LeaveDayManagement.response.UserDTO.UserDTO;
import APlus.LeaveDayManagement.service.inter.IUserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addUser (@RequestBody UserDTO request) {
        ApiResponse response = userService.addUser(request);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @PutMapping("/update")
    public ResponseEntity<ApiResponse> updateUser(@RequestBody UserDTO userDTO){
        ApiResponse response = userService.updateUser(userDTO);
        return ResponseEntity.status(response.getStatus()).body(response);
    }
}
