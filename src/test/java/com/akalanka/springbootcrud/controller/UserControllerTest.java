package com.akalanka.springbootcrud.controller;

import com.akalanka.springbootcrud.service.UserServiceImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {
    @Mock
    private UserServiceImpl userService;
    private UserController userController;

    @Test
    @Disabled
    void saveUser() {
    }

    @Test
    void getUsers() {

    }

    @Test
    @Disabled
    void getUserById() {
    }

    @Test
    @Disabled
    void updateUser() {
    }

    @Test
    @Disabled
    void deleteUser() {
    }
}