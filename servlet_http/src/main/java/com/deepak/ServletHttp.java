package com.deepak;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletHttp extends HttpServlet{
	
	public String msg;
	public void init() throws ServletException
	{
		msg = "Http Servelt Program.";
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1>" + msg + "</h1>");
		pw.println("<span>" + "Using Servlet-API package." + "</span>");
		pw.println("<h3>" + "Task Completed" + "</h3>");
	}
	
	public void destroy()
	{
	}
}

