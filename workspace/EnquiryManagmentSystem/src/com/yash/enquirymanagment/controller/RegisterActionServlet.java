package com.yash.enquirymanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.enquirymanagment.domain.User;
import com.yash.enquirymanagment.services.UserServiceImpt;
import com.yash.enquirymanagment.services.UserServiceIntf;

/**
 * Servlet implementation class RegisterActionServlet
 */
@WebServlet("/RegisterActionServlet.do")
public class RegisterActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String type=request.getParameter("type");
		String status=request.getParameter("status");
		User user=new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		user.setUsername(username);
		user.setStatus(Integer.parseInt(status));
		user.setType(Integer.parseInt(type));
		UserServiceImpt userServiceIntf=new UserServiceImpt();
		userServiceIntf.userRegistration(user);
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

}
