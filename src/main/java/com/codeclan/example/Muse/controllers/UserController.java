package com.codeclan.example.Muse.controllers;

import com.codeclan.example.Muse.models.User;
import com.codeclan.example.Muse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> findAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }


}
