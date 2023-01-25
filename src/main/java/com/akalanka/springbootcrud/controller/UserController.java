package com.akalanka.springbootcrud.controller;

import com.akalanka.springbootcrud.dto.UserDto;
import com.akalanka.springbootcrud.entity.User;
import com.akalanka.springbootcrud.service.UserServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/save")
    public UserDto saveUser(@RequestBody UserDto userDto){
        User user = convertToEntity(userDto);
        User saveUser = userService.saveUser(user);
        return convertToDto(saveUser);
    }

    private User convertToEntity(UserDto userDto) {
        User user = modelMapper.map(userDto,User.class);
        return user;
    }

    private UserDto convertToDto(User user) {
        UserDto userDto = modelMapper.map(user,UserDto.class);
        return userDto;
    }


}
