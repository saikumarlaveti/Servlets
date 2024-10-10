package com.valid;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Verifying extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");  
		String name  = req.getParameter("name");
		String password = req.getParameter("password");
		
		String name1 = "Saikumar";
		String password1 = "123456";
		
		if(name.equals(name1) && password.equals(password1))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/Result.html");
			rd.forward(req, res);
			
		}
		else
		{
			res.getWriter().println("Your name and password is incorrect");
			RequestDispatcher rd = req.getRequestDispatcher("/LoginPage.html");
			rd.include(req, res);
		}
		
	}

}
