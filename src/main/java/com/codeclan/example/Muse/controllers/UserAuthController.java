package com.codeclan.example.Muse.controllers;

import com.codeclan.example.Muse.repositories.UserAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthController {

    @Autowired
    UserAuthRepository userAuthRepository;

//    @GetMapping("/userauth")
//    public Respo
}
