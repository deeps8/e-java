import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	
		PrintWriter pw = res.getWriter();
		
		Cookie[] c = req.getCookies();
		
		pw.println("Cookie1 [name]: "+c[0].getValue());
		pw.println("Cookie2 [password]: "+c[1].getValue());
	
	}

}
