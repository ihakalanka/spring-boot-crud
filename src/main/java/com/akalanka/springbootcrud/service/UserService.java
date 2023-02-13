package com.akalanka.springbootcrud.service;

import com.akalanka.springbootcrud.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getUsers();

    ResponseEntity<HttpStatus> updateUser(User user, Long id);

    ResponseEntity<HttpStatus> deleteUser(Long id);

    User getUserById(Long id);
}
