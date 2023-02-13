package com.akalanka.springbootcrud.service;

import com.akalanka.springbootcrud.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    private UserRepository userRepository;
    private UserServiceImpl userServiceTest;

    @BeforeEach
    void setUp() {
        userServiceTest = new UserServiceImpl(userRepository);
    }

    @Test
    @Disabled
    void saveUser() {
    }

    @Test
    void getUsers() {
        userServiceTest.getUsers();
        verify(userRepository).findAll();
    }

    @Test
    @Disabled
    void updateUser() {
    }

    @Test
    @Disabled
    void deleteUser() {
    }

    @Test
    @Disabled
    void getUserById() {
    }
}