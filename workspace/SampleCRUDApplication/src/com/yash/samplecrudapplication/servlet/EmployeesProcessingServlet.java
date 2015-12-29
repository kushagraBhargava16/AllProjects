package com.yash.samplecrudapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.samplecrudapplication.domain.Employee;
import com.yash.samplecrudapplication.service.EmployeeService;
import com.yash.samplecrudapplication.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeesProcessingServlet
 */
@WebServlet("/EmployeesProcessingServlet")
public class EmployeesProcessingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	EmployeeService employeeService;
	//=new EmployeeServiceImpl();
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(true);
		PrintWriter out = response.getWriter();
		ArrayList<Employee> employees=employeeService.getAllEmployee();
		session.setAttribute("employees", employees);
		request.getRequestDispatcher("/main.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
