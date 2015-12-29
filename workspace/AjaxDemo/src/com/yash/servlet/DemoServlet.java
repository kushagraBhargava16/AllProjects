package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.yash.dao.EmployeeDao;
import com.yash.domain.Employee;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int i = 0;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		int id = Integer.parseInt(request.getParameter("id"));
		PrintWriter out = response.getWriter();
		EmployeeDao employeeDao = new EmployeeDao();
		ArrayList<Employee> employees = employeeDao.getEmployeeById(id);
		Gson gson=new Gson();
		for (Employee employee : employees) {
		
			String employeeData=gson.toJson(employee);
			//System.out.println(employeeData);
			out.write(employeeData);
		/*	out.print("<table border='1'>");
			out.print("<tr>");
			out.print("<th>");
			out.print("Id:");
			out.print("</th>");

			out.print("<td>");

			out.print(employee.getId());

			out.print("</td>");

			out.print("</tr>");
			out.print("<tr>");
			out.print("<th>");
			out.print("Name:");
			out.print("</th>");
			out.print("<td>");
			out.print(employee.getName());
			out.print("</td>");
			out.print("</tr>");
			out.print("<tr>");
			out.print("<th>");
			out.print("Contact:");
			out.print("</th>");
			out.print("<td>");
			out.print(employee.getContact());
			out.print("</td>");
			out.print("</tr>");
			out.print("</table>");*/
		}
	}

}
