package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Taken extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) {

	try {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		ServletContext con = getServletContext();
		
		String name = (String)con.getAttribute("name");
		
		out.println("Welcome "+name);
		out.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
