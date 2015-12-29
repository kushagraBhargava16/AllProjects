package com.yash.CRUD.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.yash.domain.Employee;
import com.yash.service.EmployeeService;
import com.yash.service.EmployeeServiceImpl;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeService employeeService = new EmployeeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String buttonName = request.getParameter("button");

		if (buttonName.equalsIgnoreCase("Add")) {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} else if (buttonName.equalsIgnoreCase("Delete")) {
			if (request.getParameter("selectedEmployee")==null) {
				helper(request, response);
			}
			String[] str = request.getParameterValues("selectedEmployee");
			int[] values = new int[str.length];
			for (int i = 0; i < str.length; ++i) {
				values[i] = Integer.parseInt(str[i]);
				System.err.println(values[i]);
			}

			employeeService.deleteSelectedEmployee(values);
			helper(request, response);
		} else if (buttonName.equalsIgnoreCase("Update")) {
			if (request.getParameter("selectedEmployee")==null) {
				helper(request, response);
			}
			int updateId = Integer.parseInt(request.getParameter("selectedEmployee"));
			Employee employee = employeeService.getEmployeeById(updateId);
			session.setAttribute("updateEmployee", employee);
			request.getRequestDispatcher("/update.jsp").forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String buttonName = request.getParameter("button");

		if (buttonName.equalsIgnoreCase("details")) {
			helper(request, response);
		} else if (buttonName.equalsIgnoreCase("Submit")) {

			String name = request.getParameter("name");
			String contact = request.getParameter("contact");
			String address = request.getParameter("address");
			// System.out.println(name+contact+address);
			Employee employee = new Employee(0, name, contact, address);
			employeeService.setEmployeeDetails(employee);
			helper(request, response);
		} else if (buttonName.equalsIgnoreCase("Update")) {
			Employee testEmployee = (Employee) session.getAttribute("updateEmployee");
			System.err.println(testEmployee);
			int id = testEmployee.getId();
			String name = request.getParameter("name");
			String contact = request.getParameter("contact");
			String address = request.getParameter("address");
			Employee employee = new Employee(id, name, contact, address);
			employeeService.updateEmployeeDetailsById(employee);
			helper(request, response);
		}

	}

	protected void helper(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Employee> employees = employeeService.getAllEmployee();
		request.setAttribute("employees", employees);
		request.getRequestDispatcher("/detail.jsp").forward(request, response);
	}

}