package org.example.recipeClasses;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Recipe {

    @Id @GeneratedValue
    int id;

    String title;

    String description;

    String instructions;

    String prepTime;

    String cookingTime;

    int servings;

    String difficultyLevel;

    @ManyToOne
    Rating rating;

    @ManyToMany
    List<Ingredient> ingredientList;

    @ManyToMany
    List<Category> categoryList;

    @OneToMany
    User creator;

    @GeneratedValue
    Date dateCreated;

    @GeneratedValue
    Date lastModified;

    public Recipe(int id,
                  String title,
                  String description,
                  String instructions,
                  String prepTime,
                  String cookingTime,
                  int servings,
                  String difficultyLevel,
                  Date dateCreated,
                  Date lastModified) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructions = instructions;
        this.prepTime = prepTime;
        this.cookingTime = cookingTime;
        this.servings = servings;
        this.difficultyLevel = difficultyLevel;
        this.dateCreated = dateCreated;
        this.lastModified = lastModified;
    }
}
