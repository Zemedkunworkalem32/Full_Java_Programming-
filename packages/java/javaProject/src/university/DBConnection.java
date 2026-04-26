package university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/university_db?useSSL=false&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD = ""; // Change this to your MySQL password

    public static Connection getConnection() {
        try {
            // Load driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✓ DB Connected Successfully");
            return con;

        } catch (ClassNotFoundException e) {
            System.err.println("❌ MySQL Driver not found!");
            System.err.println("Add mysql-connector-java.jar to your classpath");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Database connection failed!");
            System.err.println("Error: " + e.getMessage());
            System.err.println("\nPossible solutions:");
            System.err.println("1. Check if MySQL is running");
            System.err.println("2. Verify username and password");
            System.err.println("3. Create database: CREATE DATABASE university_db;");
            System.err.println("4. Check if port 3306 is accessible");
        }

        return null;
    }
    
    // Helper method to test connection
    public static boolean testConnection() {
        try (Connection con = getConnection()) {
            return con != null && !con.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}