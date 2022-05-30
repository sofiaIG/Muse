package com.codeclan.example.Muse.controllers;

import com.codeclan.example.Muse.models.UserAuth;
import com.codeclan.example.Muse.repositories.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAuthController {

    @Autowired
    UserAuthRepository userAuthRepository;

    @GetMapping("/userAuth")
    public ResponseEntity<List<UserAuth>> getAllUserAuth(){
        return new ResponseEntity<>(userAuthRepository.findAll(), HttpStatus.OK);
    }
}
