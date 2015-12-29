package com.yash.samplecrudapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.samplecrudapplication.domain.Employee;
import com.yash.samplecrudapplication.service.EmployeeService;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	EmployeeService employeeService;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");

		Employee employee = new Employee();
		employee.setEmployeeAddress(address);
		employee.setEmployeeContact(contact);
		employee.setEmployeeId(id);
		employee.setEmployeeName(name);
		employeeService.insertEmployee(employee);
		request.getRequestDispatcher("/EmployeesProcessingServlet").forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
