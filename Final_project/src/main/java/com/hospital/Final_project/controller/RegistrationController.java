package com.hospital.Final_project.controller;

import com.hospital.Final_project.user.User;
import com.hospital.Final_project.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/api/v1")
public class RegistrationController {

    UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/v1/registration")
    public ResponseEntity<User> userRegistration(){
        return new ResponseEntity(new User(), HttpStatus.OK);
    }
    @PostMapping("/api/v1/registration")
    public ResponseEntity<?> userRegistration(@RequestBody User user){
        userService.save(user);
        return ResponseEntity.ok("User registered successfully!");
    }

    @PostMapping("/api/v1/login")
    public ResponseEntity<?> login(){
        return ResponseEntity.ok("Login page");
    }

}
