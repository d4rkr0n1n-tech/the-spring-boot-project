package com.d4rkr0n1n.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d4rkr0n1n.project.data.UserRepository;
import com.d4rkr0n1n.project.model.User;

@Service
public class UserService{

    private final UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser() {
        User user = new User();
        user.setName("John Doe");
        userRepository.save(user);
        return user;
    }
}
