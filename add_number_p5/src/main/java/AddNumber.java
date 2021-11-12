import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumber extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		int a = Integer.parseInt(req.getParameter("num1")) ;
		int b = Integer.parseInt(req.getParameter("num2")) ;
		out.println("<h1>Sum of Two number : "+ a +" + "+ b + " = "+ (a+b) +"</h1>");
	}

}