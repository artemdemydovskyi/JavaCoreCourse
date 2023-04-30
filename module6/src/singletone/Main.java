package singletone;

import singletone.lazy.DatabaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        // Get the database connection instance
        DatabaseConnection connection = DatabaseConnection.getInstance();

        // Use the connection to execute a SQL statement
        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }
        } catch (SQLException e) {
            System.err.println("Error executing SQL statement: " + e.getMessage());
        }

        // Close the connection
        connection.getConnection().close();

    }

}