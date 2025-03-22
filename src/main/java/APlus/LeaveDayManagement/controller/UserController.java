package APlus.LeaveDayManagement.controller;

import APlus.LeaveDayManagement.response.ApiResponse;
import APlus.LeaveDayManagement.response.UserDTO.UserDTO;
import APlus.LeaveDayManagement.service.inter.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;


    public ResponseEntity<ApiResponse> addUser (UserDTO request) {
        ApiResponse response = userService.addUser(request);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<ApiResponse> viewUser (@PathVariable long id) {
        ApiResponse response = userService.viewUser(id);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @PutMapping("/update")
    public ResponseEntity<ApiResponse> updateUser(@RequestBody UserDTO userDTO){
        ApiResponse response = userService.updateUser(userDTO);
        return ResponseEntity.status(response.getStatus()).body(response);
    }
}
