package Assement19;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDetails {

    public static void main(String[] args) throws Exception {

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Database connection details
        String db = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "sit123";

        try {

            // Establish connection
            Connection con = DriverManager.getConnection(db, user, password);

            System.out.println("Connection established");

            // Create statement
            Statement stmt = con.createStatement();

            // Execute query
            String query = "SELECT * FROM product";
            ResultSet rs = stmt.executeQuery(query);

            // Display product details
            System.out.println("Product Details");
            System.out.println("----------------------------");

            while (rs.next()) {

                System.out.println("Product ID: "
                        + rs.getInt("product_id"));

                System.out.println("Product Name: "
                        + rs.getString("product_name"));

                System.out.println("Quantity: "
                        + rs.getInt("quantity"));

                System.out.println("Price: "
                        + rs.getDouble("price"));

                System.out.println("----------------------------");
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}