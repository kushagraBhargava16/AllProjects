package com.yash.login;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.util.ConnectionProvider;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet(urlPatterns="/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		Properties properties = (Properties) context.getAttribute("properties");

		Cookie cookie=new Cookie("admin", "kush");
		cookie.setValue("nikhil");
		response.addCookie(cookie);
		 response.setContentType("text/html"); 
		  out.println("<html>");
		  out.println("<head>"); out.println("</head>"); out.println("<body>");
		  out.println(properties.getProperty("title"));
		  
		  out.println("<form action='CustemerServlet.do' method='post'>"); out.println("<table>");
		  out.println("<tr>");
		out.println("<td>"+properties.getProperty("customer.id")+"</td>");
		  out.println("<td><input type ='text' name='id'/>");
		  out.println("</tr>"); out.println("<tr>");
		 out.println("<td>"+properties
		 .getProperty("customer.password")+"</td>");
		  out.println("<td><input type ='text' name='password'/>");
		  out.println("</tr>"); out.println("<tr>");
		  out.println("<td colspan = '2'><input type ='submit' value='Submit'/>"); out.println("</tr>"); out.println("</table>");
		  out.println("</body>"); out.println("</html>");
		 
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
