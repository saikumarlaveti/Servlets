package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	
	public void init()
	{
		
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		try {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		out.println("This is servlet1 "+name);
		out.print("<form action='servlet2'>");
		out.print("<input type='hidden' name='uname' value='"+name+"'>");
		out.print("<input type='submit' value='go'>");
		out.print("</form>");
		
		out.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}