package com.test;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	public void init() {
		
	}
	public void service(HttpServletRequest request,HttpServletResponse response) {
		response.setContentType("text/html");
		try {
			PrintWriter out = response.getWriter();
			String name = request.getParameter("uname");
			out.println("This is Servlet2 "+name);
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void destory() {
		
	}

}
