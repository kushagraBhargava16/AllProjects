package com.yash.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormDetails
 */
@WebServlet("/FormDetails")
public class FormDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Enumeration enumeration = request.getParameterNames();
		PrintWriter out = response.getWriter();
		
		while (enumeration.hasMoreElements()) {

			String elementName = (String) enumeration.nextElement();
			out.print(elementName + ": " + request.getParameter(elementName));

		}
	}

}
