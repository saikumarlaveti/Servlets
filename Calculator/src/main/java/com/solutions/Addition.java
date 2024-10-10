package com.solutions;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int a  = Integer.parseInt(req.getParameter("num1"));
		int b  = Integer.parseInt(req.getParameter("num2"));
		
		int result = a + b;
		System.out.println("Sum of Two Number : "+result);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("sub");
		rd.forward(req, res);
		
	}

}
