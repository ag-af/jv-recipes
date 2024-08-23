package org.example;

import org.example.db.DbConfig;
import org.example.recipeClasses.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.*;
import java.util.Date;

public class Database {
    public static SessionFactory getSessionFactory(){
        // TODO
        DbConfig db = new DbConfig();
        var sessionFactory = new Configuration()
                // use H2 in-memory database
                .setProperty(URL, db.getUrl())
                // default username / password
                .setProperty(USER, db.getUsername())
                .setProperty(PASS, db.getPassword())
                // options to display SQL in console
                .setProperty(SHOW_SQL, TRUE.toString())
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .setProperty("hibernate.agroal.maxSize", "20")
                .addAnnotatedClass(Recipe.class)
                .addAnnotatedClass(Ingredient.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Comment.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(Image.class)
                .addAnnotatedClass(Rating.class)
                .buildSessionFactory();
        return sessionFactory;
    }

    public static void seed(){
        var sessionFactory = getSessionFactory();
        // TODO
        sessionFactory.inTransaction(session -> {
//            session.persist(new Ingredient(1, "Carrot", 500, "grams"));
            Ingredient ingredient1 = new Ingredient(1, "Carrot", 500, "grams");
            session.persist(ingredient1);
            session.flush();

//            session.persist(new Category(/* your constructor params go here */));
            Category category1 = new Category(1, "Vegan");
            session.persist(category1);
            session.flush();

//            session.persist(new User(/* your constructor params go here */));
            User user1 = new User(1, "Jack", "jack@northcoders.com", "northcoders123", "admin", "01/01/2021");
            session.persist(user1);
            session.flush();
//            session.persist(new Recipe(/* your constructor params go here */));
            Recipe recipe1 = new Recipe(1, "Carrot Salad", "A healthy salad", "Wash the carrots. Cut and serve fresh", "5 minutes", "0", 4, "Easy","01/01", "04/01");
            session.persist(recipe1);
            session.flush();

//            session.persist(new Recipe(/* your constructor params go here */));

//            session.persist(new Recipe(/* your constructor params go here */));

//            session.persist(new Recipe(/* your constructor params go here */));

//            session.persist(new Recipe(/* your constructor params go here */));
        });
        sessionFactory.close();
    }
}

