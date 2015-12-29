package com.yash.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewsServletController
 */
@WebServlet("/NewsServletController")
public class NewsServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				//if (cookie.getName().equalsIgnoreCase("cNEWS")) 
				{
					System.out.println(cookie.getValue());
					getServletContext().getRequestDispatcher("/sports.html").forward(request,response);

				}

			}
		}
		getServletContext().getRequestDispatcher("/news_home.html").forward(request, response);
	}

}
