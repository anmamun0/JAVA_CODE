/* _Coder   : anmamun0
   _Created : 15 April 2024 ||  13:49:51
   _File    : one.java */
import java.sql.*;
// Connection, DriverManager, PreparedStatement, ResultSet, SQLException,Statement, CallableStatement;
public class one {
    public static void main(String[] args)
    {
        /*
         */
        //Connection -? Represents a connection to the database. It is used to establish communication with the database server. 
        //Once a connection is established, SQL statements can be executed and results can be retrieved.
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
        //Statement-? Represents a basic SQL statement that is sent to the database and executed.It is used to execute simple SQL queries that 
        //do not have parameters or dynamic values.Statements are typically used for executing queries like SELECT, INSERT, UPDATE, DELETE.
        Statement stmt = conn.createStatement();
        // PreparedStatement -? Extends the Statement interface and represents a precompiled SQL statement.It is used to execute parameterized 
        //SQL queries, where the query structure remains constant but the parameter values can change.Prepared statements are useful for 
        //preventing SQL injection attacks and improving performance in repeated executions of the same SQL query with different parameter values.
        PreparedStatement pstmt = conn.prepareStatement("SELECT *FROM mytable WHRER column = ?");
        // Callable Statement -? Extends the PreparedStatement interface and represents a precompiled SQL statement that can be used to 
        //execute stored procedures. It is used to execute stored procedures or functions that are stored in the database. Callable statements 
        //allow you to call stored procedures and retrieve their output parameters or result sets.
        CallableStatement cstmt = conn.prepareCall("{Call my_stored_procedure(?,?)}");
        //ResultSet - ? Represents the result set of a database query. It provides methods for navigating through the rows and columns of the 
        //result set and retrieving data from the database. When you execute a query using a Statement, PreparedStatement, or CallableStatement, 
        //it returns a ResultSet object containing the query results. You can then use methods like next(), getString(), getInt() to iterate over 
        //the result set and retrieve data.
        ResultSet res = stmt.executeQuery("SELECT *FROM mytable");

        while (res.next()) {
            System.out.println(res.getString("usename"));
        }
        
        res.close();
        stmt.close();
        pstmt.close();
        stmt.close();
        conn.close()
        
    }
}