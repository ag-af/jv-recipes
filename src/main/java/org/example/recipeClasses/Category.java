package org.example.recipeClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Category {
@Id @GeneratedValue
    int id;

    String name;

    @ManyToMany
    List<Recipe> recipes;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
