package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Student extends HttpServlet {
	
	String name;
	public void init(ServletConfig sc)
	{
		 name =(String) sc.getInitParameter("name");
	}
	public void service(HttpServletRequest requst,HttpServletResponse response) throws IOException
	{	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter(); 
		pw.println("My name is "+name);
		pw.close();
	}
	public void destory()
	{
		
	}
}
