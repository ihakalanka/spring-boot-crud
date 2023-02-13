package com.akalanka.springbootcrud.service;

import com.akalanka.springbootcrud.entity.User;
import com.akalanka.springbootcrud.exception.ResourceNotFoundException;
import com.akalanka.springbootcrud.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
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
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + id));
        existingUser.setName(user.getName());
        existingUser.setAddress(user.getAddress());
        existingUser.setIndexNo(user.getIndexNo());
        userRepository.save(existingUser);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> deleteUser(Long id) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + id));
        userRepository.delete(existingUser);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not exist with id : " + id));
    }
}
