package Assement23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeRecords2 {

    public static void main(String[] args) throws Exception {

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Database connection
        String db = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "sit123";

        Connection con = DriverManager.getConnection(db, user, password);

        // SQL query
        String query = "SELECT e_id, e_name, department, salary FROM employee";

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(query);

        // Display records
        System.out.println("Employee Records");
        System.out.println("-------------------------");

        while (rs.next()) {

            System.out.println("Employee ID: " + rs.getInt("e_id"));
            System.out.println("Employee Name: " + rs.getString("e_name"));
            System.out.println("Department: " + rs.getString("department"));
            System.out.println("Salary: " + rs.getDouble("salary"));
            System.out.println("-------------------------");
        }

        // Close resources
        rs.close();
        stmt.close();
        con.close();
    }
}