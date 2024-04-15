/* _Coder   : anmamun0
   _Created : 15 April 2024 ||  15:18:09
   _File    : four_Prepared_Statement_methods.java */

import java.sql.Connection;
import java.sql.DriverManager;

public class four_Prepared_Statement_methods {
    public static void main(String[] args) {

        // Establish connection to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

        // Prepare a SQL statement with parameter placeholders
        String sql = "SELECT * FROM students WHERE age > ? AND name = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // Set parameter values
        int ageThreshold = 10;
        String nameToSearch = "Mahi";
        pstmt.setInt(1, ageThreshold); // Set the first parameter (age)
        pstmt.setString(2, nameToSearch); // Set the second parameter (name)

        // Execute the prepared statement
        ResultSet rs = pstmt.executeQuery();

        // Process the ResultSet
        while (rs.next()) {
            // Retrieve data from the ResultSet
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");

            // Print the retrieved data
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }

        // Close the ResultSet, PreparedStatement, and Connection
        rs.close();
        pstmt.close();
        conn.close();
    }
}