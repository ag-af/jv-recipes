package org.example.recipeClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Category {
@Id @GeneratedValue
    int id;

    String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
