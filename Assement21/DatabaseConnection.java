package Assement21;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static void main(String[] args) throws Exception {

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Database details
        String db = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "sit123";

        try {

            // Establish connection
            Connection con = DriverManager.getConnection(db, user, password);

            System.out.println("Database connection successful");

            con.close();

        } catch (Exception e) {

            System.out.println("Database connection failed");
            System.out.println("Error: " + e.getMessage());
        }
    }
}