
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginUser extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		try
		{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		out.println("Hello "+ name);
		out.println("<br>Password  "+ pass);
		HttpSession sess = req.getSession();
		sess.setAttribute("name", name);
		sess.setAttribute("pass", pass);
		out.println("<br> <a href='./profile'> View Details</a>");
		out.close();
		
		
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}