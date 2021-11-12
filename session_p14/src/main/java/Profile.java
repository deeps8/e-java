import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Profile extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		try
		{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession sess = req.getSession();
		String name = (String)sess.getAttribute("name");
		String pass =  (String)sess.getAttribute("pass");
		
		out.println("Profile");
		out.println("Hello session storage  "+ name+ " , password  "+ pass);
		
		out.close();
		
		
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}