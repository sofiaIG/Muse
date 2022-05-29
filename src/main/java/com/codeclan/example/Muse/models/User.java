package com.codeclan.example.Muse.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
@Table(name = "user")
public class User {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "USER_NAME", unique = true)
    private String userName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserAuth userAuth;

//    @JsonIgnoreProperties({"user"})
//    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
//    private ArrayList<Post> posts;

    public User(String firstName, String lastName, String userName, UserAuth userAuth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userAuth = userAuth;
//        this.posts = new ArrayList<>();
    }

    public User() {
    }
//
//    public ArrayList<Post> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(ArrayList<Post> posts) {
//        this.posts = posts;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserAuth getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(UserAuth userAuth) {
        this.userAuth = userAuth;
    }
}
