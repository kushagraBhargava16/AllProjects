package com.yash.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class TechSupportServlet
 */
@WebServlet("/TechSupportServlet")
public class TechSupportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String email = request.getParameter("employeeEMail");
		String software = request.getParameter("softwareName");
		String operatingSystem = request.getParameter("osName");
		String description = request.getParameter("description");
		
		HttpSession session=request.getSession(true);

		session.setAttribute("emailId", email);
		
		session.setAttribute("software", software);
		
		session.setAttribute("os", operatingSystem);
		
		session.setAttribute("description", description);
		
    	ServletContext application = getServletContext();
		RequestDispatcher dispatcher = application
				.getRequestDispatcher("/ResponseServlet");
		dispatcher.forward(request, response);
		
		
		/*
		 * TechSupport support=new TechSupport(); support.setEmail(email);
		 * support.setOs(operatingSystem); support.setSoftware(software);
		 * support.setDesciprtion(description); TechSupportDAO supportDAO=new
		 * TechSupportDAO(); supportDAO.update(support);
		 */

	}

}
