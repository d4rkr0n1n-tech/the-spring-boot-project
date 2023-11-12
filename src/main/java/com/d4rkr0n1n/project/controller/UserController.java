package com.d4rkr0n1n.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d4rkr0n1n.project.model.User;
import com.d4rkr0n1n.project.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    /**
     * Handles the HTTP POST request to create a new user.
     *
     * @return ResponseEntity with the HTTP status code and the created user object.
     */
    @PostMapping(value = "/createUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> createUser() {
        User createdUser = userService.createUser();
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}
