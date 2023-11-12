package com.d4rkr0n1n.project.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.d4rkr0n1n.project.model.User;
import com.d4rkr0n1n.project.repository.UserRepository;
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Test
    void test_createUser_success() {
        // Given
        User user = new User();
        user.setName("John Doe");
        when(userRepository.save(Mockito.any(User.class))).thenReturn(user);
        // When
        User result = userService.createUser();
        // Then
        assertNotNull(result);
        assertEquals("John Doe", result.getName());

    }
}
