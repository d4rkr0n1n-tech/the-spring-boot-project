package com.d4rkr0n1n.project.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void test_setNamePropertyCorrectly() {
        User user = new User();
        String name = "John Doe";
        user.setName(name);
        assertEquals(name, user.getName());
    }
}
