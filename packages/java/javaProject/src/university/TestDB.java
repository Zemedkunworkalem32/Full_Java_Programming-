import java.sql.Connection;

import university.DBConnection;

public class TestDB {
    public static void main(String[] args) {
        System.out.println("Testing database connection...");
        
        // Test the connection
        Connection conn = DBConnection.getConnection();
        
        if (conn != null) {
            System.out.println("✓ Connection successful!");
            try {
                conn.close();
                System.out.println("✓ Connection closed.");
            } catch (Exception e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        } else {
            System.err.println("✗ Connection failed!");
        }
    }
}