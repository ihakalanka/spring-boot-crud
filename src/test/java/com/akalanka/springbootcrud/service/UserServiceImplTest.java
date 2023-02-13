package com.akalanka.springbootcrud.service;

import com.akalanka.springbootcrud.entity.User;
import com.akalanka.springbootcrud.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
    void saveUser() {
        User user = new User(
                1L,
                "Akalanka",
                "Kandy",
                "IT18112356"
        );
        //amigoscodeMethod
        /*userServiceTest.saveUser(user);

        ArgumentCaptor<User> userArgumentCaptor = ArgumentCaptor.forClass(User.class);

        verify(userRepository).save(userArgumentCaptor.capture());
        User capturedUser = userArgumentCaptor.getValue();
        assertThat(capturedUser).isEqualTo(user);*/

        //mockitoMethod
        Mockito.when(userRepository.save(user)).thenReturn(user);
        assertThat(userServiceTest.saveUser(user)).isEqualTo(user);
    }

    @Test
    void getUsers() {
        //amigoscodeMethod
        /*userServiceTest.getUsers();
        verify(userRepository).findAll();*/

        //mockitoMethod
        User user1 = new User(
                1L,
                "Akalanka",
                "Kandy",
                "IT18112356"
        );

        User user2 = new User(
                2L,
                "Tharindu",
                "Kandy",
                "IT18112357"
        );
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        Mockito.when(userRepository.findAll()).thenReturn(users);
        assertThat(userServiceTest.getUsers()).isEqualTo(users);
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
    void getUserById() {
        User user = new User(
                1L,
                "Akalanka",
                "Kandy",
                "IT18112356"
        );

        Mockito.when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        assertThat(userServiceTest.getUserById(1L)).isEqualTo(user);
    }
}