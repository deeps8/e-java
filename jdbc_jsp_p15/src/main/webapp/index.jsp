<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table, th, td {
  border: 1px solid black;
}

</style>
<title>Student details</title>
</head>
<body>
<h2>Student Details who have not paid the course fee.</h2>
<table>
<tr>
<th>Rollno</th>
<th>Name</th>
<th>Course</th>
<th>Semester</th>
<th>Amount</th>
<th>Fee Status</th>
</tr>
<%@page import="java.sql.*" %>

<%
try {
	
    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    // DATABASE URL
    final String DB_URL = "jdbc:mysql://localhost/";
    final String DB_NAME = "student";

    // DATABASE CREDS
    final String DB_USER = "root";
    final String DB_PASSWORD = "";
  
    Class.forName(JDBC_DRIVER);

    //connection to database
    Connection conn = DriverManager.getConnection(DB_URL+DB_NAME, DB_USER, DB_PASSWORD);

	
	Statement stmt = conn.createStatement();
	ResultSet rst = stmt.executeQuery("select * from students where feeStatus = 'unpaid'");
	
	while(rst.next()) {
		out.println("<tr>");
		out.println("<td> "+ rst.getString("rollno") +"</td>");
		out.println("<td> "+ rst.getString("name")+"</td>");
		out.println("<td> "+ rst.getString("course")+"</td>");
		out.println("<td> "+ rst.getString("sem")+"</td>");
		out.println("<td> "+rst.getString("amount") +"</td>");
		out.println("<td> "+ rst.getString("feeStatus") +"</td>");
		out.println("</tr>");
	}
	
	conn.close();
	
}catch(Exception e) {
	System.out.println("Error:"+e);
}

%>



</table>


</body>
</html>