/* _Coder   : anmamun0
   _Created : 15 April 2024 ||  15:03:55
   _File    : three_JDBC_Create_Statement_methos.java */

public class three_JDBC_Create_Statement_methos {
    public static void main(String[] args)
    {
    
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

        //Create a Statement obj;
        Statement stmt = conn.createStatement();

        //Execute an SQL query to create a table
        Stirng createTable = "CREATE TABLE IF NOT EXISTS employss (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), age INT)";

        stmt.execute(createTable);
        System.out.println("Table 'employess' created successfully");

        // Insert records into the table
        String insertQuery1 = "INSERT INTO employees (name, age) VALUES ('John', 30)";
        String insertQuery2 = "INSERT INTO employees (name, age) VALUES ('Alice', 25)";
        stmt.executeUpdate(insertQuery1);
        stmt.executeUpdate(insertQuery2);
        System.out.println("Records inserted successfully");

        // Execute a SELECT query to retrieve records
        String selectQuery = "SELECT * FROM employees";
        ResultSet rs = stmt.executeQuery(selectQuery);

        // Process the ResultSet and print the records
        System.out.println("Retrieving records from 'employees' table:");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }

        // Close the ResultSet, Statement, and Connection
        rs.close();
        stmt.close();
        conn.close();
    }
}