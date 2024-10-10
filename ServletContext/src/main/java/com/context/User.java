package com.context;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class User extends HttpServlet {
	
	public ServletContext sct =	null;
	
	public void init(ServletConfig sc)
	{
		sct = sc.getServletContext();
	}
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException,NumberFormatException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		int age =Integer.parseInt(sct.getInitParameter("count"));
		System.out.println("Student age  is "+age);
		pw.println(age);
		pw.close();
		
	}
	
	public void destory()
	{
		
	}

}
