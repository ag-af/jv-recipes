package org.example.recipeClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tag {
    @Id @GeneratedValue
    int id;

    String name;

    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
