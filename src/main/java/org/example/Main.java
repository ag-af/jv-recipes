package org.example;

import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        Database.seed();
        try (SessionFactory sessionFactory = Database.getSessionFactory()) {
            sessionFactory.getSchemaManager().exportMappedObjects(true);
        }
    }
}