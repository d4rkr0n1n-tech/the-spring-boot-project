package com.d4rkr0n1n.project.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d4rkr0n1n.project.data.UserRepository;
import com.d4rkr0n1n.project.model.User;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setModifiedAt(LocalDateTime.now());
        userRepository.save(user);
        return user;
    }

    public User updateUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        User userToUpdate;
        if (optionalUser.isPresent()) {
            userToUpdate = optionalUser.get();
            userToUpdate.setName(user.getName());
            userToUpdate.setModifiedAt(LocalDateTime.now());
            userRepository.save(userToUpdate);
        } else {
            userToUpdate = createUser(user);
        }
        return userToUpdate;
    }

    public User modifyUserName(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        User userToUpdate = null;
        if (optionalUser.isPresent()) {
            userToUpdate = optionalUser.get();
            userToUpdate.setName(user.getName());
            userToUpdate.setModifiedAt(LocalDateTime.now());
            userRepository.save(userToUpdate);
        }
        return userToUpdate;
    }

    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }

    public User retrieveUser(UUID id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent())
            return user.get();
        else
            return null;
    }

    public void deleteUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if (optionalUser.isPresent()) {
            userRepository.delete(optionalUser.get());
        }
    }

}
