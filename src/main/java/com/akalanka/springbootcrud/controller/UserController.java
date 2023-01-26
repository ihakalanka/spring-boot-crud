package com.akalanka.springbootcrud.controller;

import com.akalanka.springbootcrud.dto.UserDto;
import com.akalanka.springbootcrud.entity.User;
import com.akalanka.springbootcrud.service.UserServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public UserDto[] getUsers(){
        UserDto[] userDtos = modelMapper.map(userService.getUsers(),UserDto[].class);
        return userDtos;
    }
}
