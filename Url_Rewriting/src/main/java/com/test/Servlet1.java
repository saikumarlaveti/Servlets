package com.test;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	public void init()
	{
		
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		response.setContentType("text/html");
		try {
			PrintWriter out = response.getWriter();
			String n = request.getParameter("uname");
			out.println(n+"This is servlet1");
			
			out.print("<a href='servlet2?uname="+n+"'>visit</a>");
			out.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
