package com.yash.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewsPersonalizationServlet
 */
@WebServlet("/NewsPersonalizationServlet")
public class NewsPersonalizationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String personalizaValue=request.getParameter("News");
		Cookie cookie=new Cookie("cNEWS",personalizaValue);
		PrintWriter printWriter=response.getWriter();
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		
		
		response.sendRedirect("NewsServletController");
		//printWriter.println(cookie.getValue()+cookie.getName());
	}

}
