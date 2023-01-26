package com.akalanka.springbootcrud.service;

import com.akalanka.springbootcrud.entity.User;
import com.akalanka.springbootcrud.exception.ResourceNotFoundException;
import com.akalanka.springbootcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
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
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not exist with id : " + id));
    }
}
