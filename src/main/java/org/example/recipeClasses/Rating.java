package org.example.recipeClasses;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Rating {

    @Id @GeneratedValue
    int id;

    int value;

    @GeneratedValue
    Date dateRated;

    @OneToMany
    Recipe associatedRecipe;

    @OneToMany
    User rater;

    public Rating(int id, int value, Date dateRated) {
        this.id = id;
        this.value = value;
        this.dateRated = dateRated;
    }
}
