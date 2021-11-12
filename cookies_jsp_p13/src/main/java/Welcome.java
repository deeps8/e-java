import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

public class Welcome extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		Cookie c1 = new Cookie("name",name);		
		Cookie c2 = new Cookie("password",password);
		
		res.addCookie(c1);
		res.addCookie(c2);
		
		out.println("<h2>Welcome " + name+"</h2>");
		
		out.println("<br><a href='./cookies'>Check Cookies</a>");
		
	}
}
