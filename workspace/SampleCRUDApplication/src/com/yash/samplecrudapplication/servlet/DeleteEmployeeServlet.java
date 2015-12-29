package com.yash.samplecrudapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.samplecrudapplication.service.EmployeeServiceImpl;

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	EmployeeServiceImpl employeeService;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String stringId = request.getParameter("id");
		if (stringId.isEmpty()) {
			employeeService.deleteAllEmployee();
		} else {
			int id = Integer.parseInt(stringId);
			employeeService.deleteEmployeeById(id);

		}
		request.getRequestDispatcher("/EmployeesProcessingServlet").forward(
				request, response);

		// out.print("kush");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
