package com.solutions;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Subtraction extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i =Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int sub = i-j;
		res.getWriter().println("subtraction:" + sub);
		
		RequestDispatcher rd = req.getRequestDispatcher("mul");
		rd.forward(req, res);
	}

}
