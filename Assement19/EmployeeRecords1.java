package Assement19;

import java.sql.*;

public class EmployeeRecords1 {

    public static void main(String[] args) throws Exception {

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Database connection details
        String db = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "sit123";

        // Establish connection
        Connection con = DriverManager.getConnection(db, user, password);

        System.out.println("Connection established!");

        // Create statement
        Statement stmt = con.createStatement();

        // Execute query
        ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

        // Display employee records
        while (rs.next()) {

            System.out.println("Employee ID: " + rs.getInt("e_id"));
            System.out.println("Employee Name: " + rs.getString("e_name"));
            System.out.println("Employee Salary: " + rs.getDouble("e_sal"));
            System.out.println("-------------------------");
        }

        // Close connection
        rs.close();
        stmt.close();
        con.close();

        System.out.println("Connection closed.");
    }
}