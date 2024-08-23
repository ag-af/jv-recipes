package org.example.recipeClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Ingredient {

    @Id
    int id;

    String name;

    int quantity;

    String unitOfMeasurement;

    @ManyToMany
    Recipe recipe;

    public Ingredient(int id, String name, int quantity, String unitOfMeasurement) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
    }
}
