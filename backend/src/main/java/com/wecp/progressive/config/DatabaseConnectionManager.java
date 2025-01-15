package com.wecp.progressive.config;

<<<<<<< HEAD
=======
import java.io.IOException;
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
<<<<<<< HEAD

public class DatabaseConnectionManager {

=======
public class DatabaseConnectionManager {
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
    private static final Properties properties = new Properties();
    static {
        loadProperties();
    }
<<<<<<< HEAD
    private static void loadProperties () {
        try {
            InputStream input = DatabaseConnectionManager.class.getClassLoader()
                                .getResourceAsStream("application.properties");
            if(input == null) {
                throw new IllegalStateException("resources.properties not found in classpath");
            }
            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Error loading properties file", e);
            // TODO: handle exception
=======
    private static void loadProperties() {
try (InputStream input = DatabaseConnectionManager.class.getClassLoader()
.getResourceAsStream("application.properties")) 
{
            if (input == null) {
                throw new IllegalStateException("resource.properties not found in classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
        }
    }
    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("spring.datasource.url");
<<<<<<< HEAD
        String username = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url, username, password);
    }
}
=======
        String user = properties.getProperty("spring.datasource.username");
     String password = properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url, user, password);
    }
}
>>>>>>> 9b7fc615716dac28924471eedee63ac4d7cc3b8b
