package com.d4rkr0n1n.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d4rkr0n1n.project.model.User;
import com.d4rkr0n1n.project.repository.UserRepository;

@Service
public class UserService{

    @Autowired
    UserRepository userRepository;

    public User createUser() {
        User user = new User();
        user.setName("John Doe");
        userRepository.save(user);
        return user;
    }
    
    
}
