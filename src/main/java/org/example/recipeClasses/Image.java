package org.example.recipeClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Image {

    @Id @GeneratedValue
    int id;

    String filename;

    String fileData;

    public Image(int id, String filename, String fileData) {
        this.id = id;
        this.filename = filename;
        this.fileData = fileData;
    }

    @OneToOne
    Recipe associatedRecipe;
}
