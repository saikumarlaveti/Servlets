package com.valid;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class User  extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		
		RequestDispatcher rd = req.getRequestDispatcher("ver");
		rd.forward(req, res);
	}

}
