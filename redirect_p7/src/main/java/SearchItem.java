import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchItem extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		//res.setContentType("text/html");
		//PrintWriter out = res.getWriter();
		
		String name = req.getParameter("item");
		res.sendRedirect("https://www.google.co.in/search?q=" + name);
	}
}