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
    List<Comment> comments;

    @OneToMany
    User creator;

    @GeneratedValue
    String dateCreated;

    @GeneratedValue
    String lastModified;

    @OneToOne
    Image image;

    public Recipe(int id,
                  String title,
                  String description,
                  String instructions,
                  String prepTime,
                  String cookingTime,
                  int servings,
                  String difficultyLevel,
                  String dateCreated,
                  String lastModified) {
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
