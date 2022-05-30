package com.codeclan.example.Muse.components;

import com.codeclan.example.Muse.models.Post;
import com.codeclan.example.Muse.models.User;
import com.codeclan.example.Muse.models.UserAuth;
import com.codeclan.example.Muse.repositories.PostRepository;
import com.codeclan.example.Muse.repositories.UserAuthRepository;
import com.codeclan.example.Muse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserAuthRepository userAuthRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        User user = new User("sofia", "ignatiadi", "sofiaIG");
        UserAuth userAuth = new UserAuth("sofiaIG@gmail.com" );
        userAuth.checkPass("test123", userAuth.hashPassword("test123"));
        userAuth.setPassword(userAuth.hashPassword("test123"));
        System.out.println(userAuth.getPassword());
        user.setUserAuth(userAuth);
        userAuth.setUser(user);

        userRepository.save(user);
        userAuthRepository.save(userAuth);

        Post post = new Post("Looking for singer", "You read the title. That's basically it", user);
        postRepository.save(post);


    }
}
