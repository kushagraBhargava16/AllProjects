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

import com.yash.dao.EmployeeDAO;

/**
 * Servlet implementation class EmployeeCreateServlet
 */
@WebServlet("/EmployeeCreateServlet")
public class EmployeeCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		String emailId=(String)session.getAttribute("emailId");
		String firstname=request.getParameter("firstName");
		String lastname=request.getParameter("lastName");
		String mobile=request.getParameter("mobileNumber");
		PrintWriter printWriter=response.getWriter();
		EmployeeDAO dao=new EmployeeDAO();
		String sql="insert into employee values('"+emailId+"','"+firstname+"','"+lastname+"','"+mobile+"')";
		dao.addEmployee(sql);
		printWriter.println(mobile);
		/*ServletContext application = getServletContext();
		RequestDispatcher dispatcher = application
				.getRequestDispatcher("/ResponseServlet");
		dispatcher.forward(request, response);*/	}

}
