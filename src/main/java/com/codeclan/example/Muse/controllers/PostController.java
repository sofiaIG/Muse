package com.codeclan.example.Muse.controllers;

import com.codeclan.example.Muse.models.Post;
import com.codeclan.example.Muse.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping(value = "/posts")
    public ResponseEntity<List<Post>> getAllPosts(){
        return new ResponseEntity<>(postRepository.findAll(), HttpStatus.OK);
    }
}
