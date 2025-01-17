package com.config;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class User extends HttpServlet {

    public int count;

    @Override
    public void init(ServletConfig sc) throws ServletException {
        super.init(sc);
        
        // Retrieve the initialization parameter
        String countParam = sc.getInitParameter("count");
        if (countParam != null) {
            try {
                count = Integer.parseInt(countParam);
            } catch (NumberFormatException e) {
                throw new ServletException("Invalid number format for count parameter", e);
            }
        }
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        res.getWriter().println("Count value is: " + count);
    }

    @Override
    public void destroy() {
    }
}
