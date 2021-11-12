<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basic Calculator</title>
</head>
<body style="margin:20px">
    <h1>Basic Calculator Using JSP.</h1>
    <form action="./index.jsp">
        Enter First Number : <input type="number" name="num1" > <br><br> 
        Enter Second Number : <input type="number" name="num2" > <br><br>
        Select Operation : <select name="op" >
            <option value="1">Sum</option>
            <option value="2">Subtraction</option>
            <option value="3">Multiplication</option>
            <option value="4">Division</option>
        </select> <br><br>
        <input type="submit" value="Solve">
    </form>

    <% 
            String a = request.getParameter("num1");
            String b = request.getParameter("num2");
            String op = request.getParameter("op");
            if(a != null && b != null){
                int n1 = Integer.parseInt(a);
                int n2 = Integer.parseInt(b);
            
                switch(op){
                    case "1" :  out.println("<h4>Sum is : " + (n1+n2)+"</h4>"); break;
                    case "2" :  out.println("<h4>Subtraction is : " + (n1-n2)+"</h4>"); break;
                    case "3" :  out.println("<h4>Multiplication is : " + (n1*n2)+"</h4>"); break;
                    case "4" :  out.println("<h4>Division is : " + (n1/n2)+"</h4>"); break;
                    default : out.println("<h4>Wrong Choice</h4>");
                }
            }

    %>

</body>
</html>
