
package thiago2020310.librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Thiago
 * 
 * This class will be use to store the database info.
 * Singleton pattern will be used to ensure only one instance of the class is managing the database connection.
 * 
 */
public class DatabaseConnection {
    private final String url = "jdbc:mysql://localhost:3306/library_system"; // DB name
    private final String user = "root"; // default XAMPP/MySQL username
    private final String password = ""; // default password in XAMPP is empty

    public void DatabaseConnection(User newUser) {
        try {
            // Load the MySQL JDBC driver (this line is sometimes optional in modern Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connected to MySQL!");

                // SQL to insert user
                String sql = "INSERT INTO Users (name, email, password, role) VALUES (?, ?, ?, ?)";

                // Use PreparedStatement to safely insert values
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, newUser.getName());
                    stmt.setString(2, newUser.getEmail());
                    stmt.setString(3, newUser.getPassword());
                    stmt.setString(4, newUser.getRole());

                    int rowsInserted = stmt.executeUpdate();

                    if (rowsInserted > 0) {
                        System.out.println("User " + newUser.getName() + " inserted successfully.");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connecting to DB: " + e.getMessage());
        }
    }
}
