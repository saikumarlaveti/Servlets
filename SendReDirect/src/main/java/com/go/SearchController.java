package com.go;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SearchController extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		String url  = req.getParameter("enter");
		System.out.println(url);
		
		res.sendRedirect("https://www.google.com/search?q=" + url);
		
	}
	

}
