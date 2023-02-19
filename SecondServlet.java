package com.nik;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SecondServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

	try {
		response.setContentType("text/html");
		Cookie ck[]=request.getCookies();
		response.getWriter().append("Welcome  "+ck[0].getValue());
	} 
	
	catch (Exception e) {
	
		System.out.println(e);
	}

	}

}
