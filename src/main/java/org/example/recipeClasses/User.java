package org.example.recipeClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.Generated;

import java.util.Date;
import java.util.List;

@Entity
public class User {

    @Id @GeneratedValue
    int id;

    String username;

    String email;

    String password;

    String roles;


    String dateRegistered;

    @ManyToOne
    List<Rating> ratings;

    @ManyToOne
    List<Recipe> recipes;

    @ManyToOne
    List<Comment> comments;



    public User(int id, String username, String email, String password, String roles, String dateRegistered) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.dateRegistered = dateRegistered;
    }
}
