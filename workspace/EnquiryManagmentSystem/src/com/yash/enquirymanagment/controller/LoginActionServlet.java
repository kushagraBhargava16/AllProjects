package com.yash.enquirymanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.enquirymanagment.domain.Enquiry;
import com.yash.enquirymanagment.domain.User;
import com.yash.enquirymanagment.services.EnquiryServiceImpt;
import com.yash.enquirymanagment.services.UserServiceImpt;
import com.yash.enquirymanagment.services.UserServiceIntf;
import com.yash.enquirymanagment.util.DBUtil;

/**
 * Servlet implementation class LoginActionServlet
 */
@WebServlet("/LoginActionServlet.do")
public class LoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		UserServiceImpt serviceIntf=new UserServiceImpt();
		User user=serviceIntf.userAuthenticatioin(username, password);
		out.print(username+password+user.getUsername());
		HttpSession session=request.getSession(true);
		
		if(username.equalsIgnoreCase(user.getUsername())){
			out.print("welcome");
			/*System.out.println(enquiries);
			for (Enquiry enquiry : enquiries) {
				System.out.println(enquiry);
			}*/
			/*request.setAttribute("enquiries", enquiries);
			ServletContext context=getServletContext();
			context.setAttribute("userid", user.getUserid());*/
			EnquiryServiceImpt enquiryServiceImpt=new EnquiryServiceImpt();
			ArrayList<Enquiry> enquiries=enquiryServiceImpt.showEnquiry(user.getUserid());
			session.setAttribute("enquiries", enquiries);
			session.setAttribute("userid",  user.getUserid());
			session.setAttribute("user",  user);
			
			request.getRequestDispatcher("/ListEnquiries.jsp").forward(request, response);
			
		}
		
	}

}
