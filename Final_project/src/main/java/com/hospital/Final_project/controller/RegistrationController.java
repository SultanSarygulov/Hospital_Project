package com.hospital.Final_project.controller;

import com.hospital.Final_project.user.User;
import com.hospital.Final_project.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class RegistrationController {

    UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    public ResponseEntity<?> userRegistration(@RequestBody User user){
        userService.save(user);
        return ResponseEntity.ok(new String("User registered successfully!"));
    }

}
