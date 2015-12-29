package com.yash.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.dao.CustomerDAO;
import com.yash.domain.Customer;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		CustomerDAO customerDao=new CustomerDAO();
		String id=request.getParameter("id");
		ArrayList customers;
		if(id.isEmpty()){
		customers=customerDao.getAllCustomerById();
			
		}
		else{
			 customers=customerDao.getCustomerById(id);
			
		}
		
		request.setAttribute("customers",customers);
		request.getRequestDispatcher("/display.jsp").forward(request, response);
	}

}
