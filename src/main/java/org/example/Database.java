package org.example;

import org.example.db.DbConfig;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.*;

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
                .buildSessionFactory();
        return sessionFactory;
    }
}
