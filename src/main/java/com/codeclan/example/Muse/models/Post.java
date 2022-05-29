package com.codeclan.example.Muse.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="TITLE")
    private String title;

    @Column(name = "TEXT")
    private String text;

//    @JsonIgnoreProperties({"posts"})
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;

    public Post(String title, String text, User user) {
        this.title = title;
        this.text = text;
//        this.user = user;
    }

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
