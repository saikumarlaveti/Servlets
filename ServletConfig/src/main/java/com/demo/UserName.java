package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserName extends HttpServlet {
	
	public int age;
	
	public void init(ServletConfig sc)
	{
		 age = Integer.parseInt(sc.getInitParameter("age"));
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter(); 
		
		pw.println("Saikumar age is : "+age);
		
	}

	public void destroy()
	{
		
	}
}
