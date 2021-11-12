<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Get User Details</h1>
    <form action = "./index.jsp">
    Name :<input type="text" name="name" required> <br><br>
    Roll Number : <input type="number" name="roll_no" required> <br><br>
    Phone Number : <input type="tel" name="phone" required> <br><br>
    Email : <input type="email" name="email" required> <br><br>
    Year Of Admission : <input type="number" name="start" required> <br><br>
    Result Of 12th : <input type="number" name="result" required> <br><br>

    Choose a course:
    <select name="course" required >
        <option value="mca">MCA</option>
        <option value="bba">BBA</option>
        <option value="mba">MBA</option>
        <option value="bcom">B.Com</option>
    </select><br><br>
    <input type="submit" value="submit">
    </form>
    <%
    if(request.getParameter("name") != null)
    {
        String name=  request.getParameter("name");
        String roll=  request.getParameter("roll_no");
        String mobile=  request.getParameter("phone");
        String Course=  request.getParameter("course");
        String email=  request.getParameter("email");
        String start=  request.getParameter("start");
        String result=  request.getParameter("result");

        out.println("<h4>Student name is	: " +name+"</h4>");
        out.println("<h4>Mobile number	: " +mobile+"</h4>");
        out.println("<h4>roll no	: " +roll+"</h4>");
        out.println("<h4>email	: " +email+"</h4>");
        out.println("<h4>result	: " +result+"</h4>");
        out.println("<h4>starting year : " +start+"</h4>");
        out.println("<h4>Course 	: " +Course+"</h4>");
    }
    %>
</body>
</html>