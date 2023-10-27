package com.d4rkr0n1n.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d4rkr0n1n.project.model.User;
import com.d4rkr0n1n.project.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    // method to test controller
    @RequestMapping("/test")
    public String test() {
        User user = new User();
        user.setName("John Doe");
        userRepository.save(user);
        return "Hello World!";
    }

}
