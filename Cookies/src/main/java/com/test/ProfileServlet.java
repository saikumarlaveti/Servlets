package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
  
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                         throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        request.getRequestDispatcher("link.html").include(request, response);

        Cookie[] ck = request.getCookies();
        if (ck != null) {
            String name = null;

            // Loop through cookies to find the "name" cookie
            for (Cookie cookie : ck) {
                if (cookie.getName().equals("name")) {
                    name = cookie.getValue();
                    break;
                }
            }

            if (name != null && !name.equals("")) {
                out.print("<b>Welcome to Profile</b>");
                out.print("<br>Welcome, " + name);
            } else {
                out.print("Please login first");
                request.getRequestDispatcher("login.html").include(request, response);
            }
        } else {
            out.print("Please login first");
            request.getRequestDispatcher("login.html").include(request, response);
        }

        out.close();
    }
}
