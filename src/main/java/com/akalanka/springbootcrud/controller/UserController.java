package com.akalanka.springbootcrud.controller;

import com.akalanka.springbootcrud.dto.UserDTO;
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
    public UserDTO[] getUsers(){
        UserDTO[] userDtos = modelMapper.map(userService.getUsers(), UserDTO[].class);
        return userDtos;
    }

    @GetMapping("/user/{id}")
    public UserDTO getUserById(@PathVariable Long id){
        User user = userService.getUserById(id);
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Long id){
        userService.updateUser(user,id);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
