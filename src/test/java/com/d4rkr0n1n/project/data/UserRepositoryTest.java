package com.d4rkr0n1n.project.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.d4rkr0n1n.project.model.User;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void test_createUser_Successfully() {
        User user = new User();
        user.setName("John Doe");
        userRepository.save(user);
        assertEquals(user, userRepository.findById(user.getId()).get());
    }
}
