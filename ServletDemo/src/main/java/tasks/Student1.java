package tasks;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Student1 extends HttpServlet {
	ServletContext sct = null;
	String college;
	public void init(ServletConfig sc)
	{	
		sct = sc.getServletContext();
		college =(String) sct.getInitParameter("details");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println(college);
		pw.close();
	}
	public void destory()
	{
		
	}
		
}
