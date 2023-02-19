package com.nik;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		try {
			response.setContentType("text/html");

			String n=request.getParameter("userName");
			response.getWriter().append("Welcome "+n);
			
			//creating cookie object
			Cookie ck=new Cookie("u",n); 
			
			//Adding cookies object
			response.addCookie(ck);
			
			//creating Submit button
			response.getWriter().append("<form action='servlet2' method='post'>");
			response.getWriter().append("<input type='submit' value='go'>");
			response.getWriter().append("</form>");
		} 
		
		catch (Exception e) {
			System.out.println(e);
			
		}
	
	
		
	}

}
