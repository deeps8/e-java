import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqDispatcher extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		if(pass.equals("password")) {
			RequestDispatcher rd = req.getRequestDispatcher("/home");
			rd.forward(req,res);
		}
		else {
			out.println("<p style='color:red'>Wrong Name or Password </p>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.include(req,res);
		}
	}
}
