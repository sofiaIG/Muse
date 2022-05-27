package com.codeclan.example.Muse.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AUTH_USER_DETAILS")
public class UserAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_KEY")
    private String password;


    @Column(name = "CREATED_ON")
    private Date createdAt;

    @Column(name = "UPDATED_ON")
    private Date updatedAt;


    @Column(name = "email")
    private String email;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


    public UserAuth(String password, Date createdAt, Date updatedAt, String email) {
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.email = email;

    }

    public UserAuth() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}