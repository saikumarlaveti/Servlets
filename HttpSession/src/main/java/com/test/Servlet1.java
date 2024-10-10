package com.test;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
	public void init() {
		
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
		try {
			PrintWriter out = response.getWriter();
			
			String value = request.getParameter("name");
			int password =Integer.parseInt(request.getParameter("password"));
			
			HttpSession session = request.getSession();
			session.setAttribute("name", value);
			
			out.println("This is servlet 1 :"+value+" Your Password is "+password);
			
			out.print("<a href='servlet2'>visit</a>");
			out.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
