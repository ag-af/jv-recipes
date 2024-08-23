package org.example.recipeClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Image {

    @Id @GeneratedValue
    int id;

    String fileName;

    String fileData;

    public Image(int id, String filename, String fileData) {
        this.id = id;
        this.fileName = filename;
        this.fileData = fileData;
    }

    @OneToOne
    Recipe associatedRecipe;
}
