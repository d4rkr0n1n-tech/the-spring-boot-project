package com.d4rkr0n1n.project.data;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d4rkr0n1n.project.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    
}
