package org.example.recipeClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Rating {

    @Id @GeneratedValue
    int id;

    int value;

    @GeneratedValue
    Date dateRated;

    @ManyToOne
    Recipe associatedRecipe;

    @ManyToOne
    User rater;

    public Rating(int id, int value, Date dateRated) {
        this.id = id;
        this.value = value;
        this.dateRated = dateRated;
    }
}
