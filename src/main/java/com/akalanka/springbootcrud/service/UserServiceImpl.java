package com.akalanka.springbootcrud.service;

import com.akalanka.springbootcrud.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public ResponseEntity<HttpStatus> updateUser(User user, Long id) {
        return null;
    }

    @Override
    public ResponseEntity<HttpStatus> deleteUser(Long id) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }
}
