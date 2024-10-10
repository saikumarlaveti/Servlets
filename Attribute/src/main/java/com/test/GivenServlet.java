package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GivenServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{	
		res.setContentType("text/html");
		PrintWriter out = res.getWriter(); 
		
		ServletContext sct =req.getServletContext();
		
		sct.setAttribute("name","Saikumar Laveti");
	
		
		RequestDispatcher rd = req.getRequestDispatcher("/xyz");
		rd.forward(req, res);
		
	
	}

}
