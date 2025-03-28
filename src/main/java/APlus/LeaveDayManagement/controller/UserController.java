package APlus.LeaveDayManagement.controller;

import APlus.LeaveDayManagement.response.ApiResponse;
import APlus.LeaveDayManagement.response.UserDTO.UserDTO;
import APlus.LeaveDayManagement.service.inter.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable long id){
        ApiResponse response = userService.deleteUser(id);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<ApiResponse> viewUser(@PathVariable long id) {
        ApiResponse response = userService.viewUser(id);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @GetMapping("/view")
    public ResponseEntity<ApiResponse> viewAllUser(
            @RequestParam (defaultValue = "0") int page,
            @RequestParam (defaultValue = "5") int size) {
        Pageable pageable = PageRequest.of(page, size);
        ApiResponse response = userService.viewAllUser(pageable);
        return ResponseEntity.status(response.getStatus()).body(response);
    }
}
