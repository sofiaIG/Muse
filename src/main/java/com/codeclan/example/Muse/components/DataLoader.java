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
import org.springframework.stereotype.Component;

import java.util.Collections;

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

        User user = new User("Sofia", "Ignatiadi", "sofiaIG");
        UserAuth userAuth = new UserAuth("sofiaIG@gmail.com" );
        Collections.addAll(user.getFavouriteArtists(), "Mitski", "Japanese Breakfase", "Soccer Mommy",
                "Snail Mail", "Phoebe Bridgers");
        Collections.addAll(user.getCurrentlyListeningTo(), "Kendrick Lamar", "2Pac", "Melentini");
        userAuth.setPassword(userAuth.hashPassword("test123"));
        user.setUserAuth(userAuth);
        userAuth.setUser(user);

        userRepository.save(user);
        userAuthRepository.save(userAuth);

        Post post = new Post("Looking for singer", "You read the title. That's basically it", user);
        postRepository.save(post);


    }
}
