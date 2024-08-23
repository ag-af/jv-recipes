package org.example.recipeClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.Generated;

import java.util.Date;

@Entity
public class User {

    @Id @GeneratedValue
    int id;

    String username;

    String email;

    String password;

    String roles;

    @Generated
    Date dateRegistered;

    public User(int id, String username, String email, String password, String roles, Date dateRegistered) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.dateRegistered = dateRegistered;
    }
}
