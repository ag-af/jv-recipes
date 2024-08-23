package org.example.db;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DbConfig {
    private Properties properties;

    public DbConfig() {
        properties = new Properties();
        String configFilePath= "config/db.properties";
        File configFile = new File(configFilePath);
        try (FileInputStream configFileReader = new FileInputStream(configFile)) {
            properties.load(configFileReader);
        } catch (IOException e) {
            System.err.println("Error loading config file: " + e.getMessage());
        }
    }

    public String getUrl() {
        return properties.getProperty("db.url");
    }

    public String getUsername() {
        return properties.getProperty("db.user");
    }

    public String getPassword(){
        return properties.getProperty("db.pass");
    }
}
