package tasks;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Student2 extends HttpServlet{
	ServletContext scn = null;
	String college;
	public void init(ServletConfig sc)
	{
		scn = sc.getServletContext();
		college = scn.getInitParameter("details");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println(college);
		pw.close();
	}
	
	public void destory()
	{
		
	}

}