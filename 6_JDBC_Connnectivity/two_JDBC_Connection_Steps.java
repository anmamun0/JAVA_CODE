/* _Coder   : anmamun0
   _Created : 15 April 2024 ||  14:39:46
   _File    : two.java */
import javax.sql.*;
public class two_JDBC_Connection_Steps {
    public static void main(String[] args)
    {
        // Load the MySQL JDBC driver
        Class.forName("Com.mysql.jdbc.Driver");

        // Establish connection to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

        // Create a Statement object
        Statement stmt = conn.createStatement();

        // Define the SQL query
        String sql = "SELECT *FROM users";

        // Execute the query and get the ResultSet
        ResultSet res = stmt.executeQuery(sql);

        // Iterate over the ResultSet and print the values
        while (res.next()) {
            System.out.println(res.getString("usename"));
        }
        // Close the ResultSet, Statement, and Connection
        res.close();
        stmt.close();
        conn.close();

    }
}