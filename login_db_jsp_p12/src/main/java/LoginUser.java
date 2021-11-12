import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginUser extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        try {

            // get the data from response
            String name = req.getParameter("name");
            String pass = req.getParameter("pass");
            
            Connection conn = MysqlConnector.initializeDatabase();
            PreparedStatement ps = conn.prepareStatement("select * from user where name=? and password=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
                // found user , now redirect to welcome page.
                RequestDispatcher rd = req.getRequestDispatcher("./welcome");
                rd.forward(req, res);
            }
            else{
                // not found user , redirect to login page.
                out.println("<p style='color:red' >Invalid Username or Password</p>");
                RequestDispatcher rd = req.getRequestDispatcher("./index.jsp");
                rd.include(req, res);
            }
            

        } catch (ClassNotFoundException | SQLException e) {

            out.println("Something Went Wwrong <br> ERROR : "+e.toString());

        }
		
    }
}