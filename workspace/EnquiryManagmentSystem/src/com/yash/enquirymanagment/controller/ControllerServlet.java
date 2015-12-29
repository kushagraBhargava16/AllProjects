package com.yash.enquirymanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet.do")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("kushagta");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}
  


}
