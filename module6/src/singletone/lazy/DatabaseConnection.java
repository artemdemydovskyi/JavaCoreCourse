package singletone.lazy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection INSTANCE ;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/mydatabase";
    private String username = "root";
    private String password = "password";

    // Private constructor to prevent instantiation outside of this class
    private DatabaseConnection() {
        try {
            // Load the MySQL driver class
            Class.forName("com.mysql.jdbc.Driver");

            // Create a new database connection
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: MySQL driver class not found");
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database");
        }
    }

    // Public method to get the Singleton instance
    public static synchronized DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnection();
        }
        return INSTANCE;
    }

    // Public method to get the database connection
    public Connection getConnection() {
        return connection;
    }
}
