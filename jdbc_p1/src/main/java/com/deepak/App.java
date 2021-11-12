package com.deepak;

import java.sql.*;
import java.util.Scanner;
public class App {

    // initialize the value of driver,database,user,password

    // DRIVER
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    // DATABASE URL
    static final String DB_URL = "jdbc:mysql://localhost/student";

    // DATABASE CREDS
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection conn = null;
        Statement stmt = null;
        Scanner sc = new Scanner(System.in);
        
        try{

            //register driver
            Class.forName(JDBC_DRIVER);

            //connection to database
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            stmt = conn.createStatement();
	        ResultSet rst = stmt.executeQuery("select * from students");

            while(rst.next()){
                System.out.printf("%-5s %-10s %-5s %-5s %-10s %s\n",
                                    rst.getString("rollno"),
                                    rst.getString("name"),
                                    rst.getString("course"),
                                    rst.getString("sem"),
                                    rst.getString("amount"),
                                    rst.getString("feeStatus")
                                    );
            }
           
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
            sc.close();
        }
    }
}

