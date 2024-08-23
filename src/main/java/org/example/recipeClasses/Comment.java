package org.example.recipeClasses;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Comment {

    @Id @GeneratedValue
    int id;

    String text;

    @GeneratedValue
    Date datePosted;

    @OneToMany
    User author;

    @ManyToOne
    Recipe recipe;

    public Comment(int id, String text, Date datePosted) {
        this.id = id;
        this.text = text;
        this.datePosted = datePosted;
    }
}
