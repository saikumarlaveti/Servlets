package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Result extends HttpServlet{
	public void init()
	{
		
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		try {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("uname");
		
		out.println("This is servlet2 "+name);

		
		out.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
