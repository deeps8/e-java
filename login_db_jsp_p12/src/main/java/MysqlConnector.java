import java.sql.*;
public class MysqlConnector {
    protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException
    {
        // initialize the value of driver,database,user,password

        // DRIVER
        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

        // DATABASE URL
        final String DB_URL = "jdbc:mysql://localhost/";
        final String DB_NAME = "college";

        // DATABASE CREDS
        final String DB_USER = "root";
        final String DB_PASSWORD = "";
  
        Class.forName(JDBC_DRIVER);

        //connection to database
        Connection conn = DriverManager.getConnection(DB_URL+DB_NAME, DB_USER, DB_PASSWORD);
        return conn;
    }
}
