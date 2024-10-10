package com.test;



import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {
	public void init() {
		
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
		try {
			PrintWriter out = response.getWriter();
			
			HttpSession session = request.getSession(false);
			String value1 = (String)session.getAttribute("name");
			
			out.println("This is servlet 2");
			out.println(value1);
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
