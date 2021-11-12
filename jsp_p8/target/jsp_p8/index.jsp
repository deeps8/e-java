<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prac 8</title>
</head>
<body>
    <h1>Show Name and Roll Number using JSP.</h1>
    <form action = "./index.jsp">
        Name : <input type="text" name="name">
        <br><br>
        Roll Number : <input type="number" name="roll">
        <br><br>
        <input type="submit" value="Submit">
    </form>
    <%
    String name=  request.getParameter("name");
    String roll=  request.getParameter("roll");


    if(name != null)
    {
        out.println("<h4> Student Name is : " +name+"</h4>");
    }

    if(roll != null)
    {
        out.println("<br>");
        out.println("<h4> Roll Number : " +roll+"</h4>");
    }

    %>
</body>
</html>