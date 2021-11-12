import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertData extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        try {
            
            Connection conn = MysqlConnector.initializeDatabase();
            PreparedStatement pstmt = null;
            out.println("<h3>Database Connection Stablished</h3>");
            // get the data from response
            String name = req.getParameter("name");
            String course = req.getParameter("course");
            int roll_no =Integer.parseInt(req.getParameter("roll_no"));
            int sem =Integer.parseInt(req.getParameter("sem"));
            
            String query = "insert into students  (rollno, name,course,sem)" + " values (?,?,?,?)";
            
            pstmt = conn.prepareStatement(query);
                
            //set params value
            pstmt.setInt(1,roll_no);
            pstmt.setString(2,name);
            pstmt.setString(3,course);
            pstmt.setInt(4,sem);

            pstmt.executeUpdate();

            out.println("<h4>Success. Data is inserted.</h4>");

        } catch (ClassNotFoundException | SQLException e) {

            out.println("Something Went Wwrong <br> ERROR : "+e.toString());

        }
		
    }
}

