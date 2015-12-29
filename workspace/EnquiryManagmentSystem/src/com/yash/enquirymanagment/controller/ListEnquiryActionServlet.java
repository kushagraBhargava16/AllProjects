package com.yash.enquirymanagment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.enquirymanagment.domain.Enquiry;
import com.yash.enquirymanagment.services.EnquiryServiceImpt;

/**
 * Servlet implementation class ListEnquiryActionServlet
 */
@WebServlet("/ListEnquiryActionServlet.do")
public class ListEnquiryActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// out.print("home");
		HttpSession session = request.getSession(true);
		String buttonName = request.getParameter("button");
		int userid = (Integer) session.getAttribute("userid");

		EnquiryServiceImpt enquiryServiceImpt = new EnquiryServiceImpt();

		if (("Delete All Enquiries!").equalsIgnoreCase(buttonName)) {
			int check = enquiryServiceImpt.delAllEnquiryById(userid);
			ArrayList<Enquiry> enquiries = enquiryServiceImpt
					.showEnquiry(userid);
			session.setAttribute("enquiries", enquiries);
			response.sendRedirect("ListEnquiries.jsp");

			/*
			 * String name = request.getParameter("name"); String email =
			 * request.getParameter("email"); String contact =
			 * request.getParameter("contact");
			 * 
			 * String[] courses = request.getParameterValues("courses");
			 * StringBuffer buffer = new StringBuffer();
			 * 
			 * for (int i = 0; i < courses.length; i++) { if (i < courses.length
			 * - 1) { buffer.append(courses[i] + ", "); } else {
			 * buffer.append(courses[i] + ". ");
			 * 
			 * } } String course = buffer.toString(); Enquiry enquiry = new
			 * Enquiry(); enquiry.setContact(Long.parseLong(contact));
			 * enquiry.setCourses(course); enquiry.setEmail(email);
			 * enquiry.setName(name); enquiry.setUserid(userid); int check =
			 * enquiryServiceImpt.addEnquiry(enquiry);
			 * 
			 * if (check == 0) {
			 * 
			 * request.getRequestDispatcher("/addEnquiry.jsp").forward( request,
			 * response);
			 * 
			 * } else { ArrayList<Enquiry> enquiries = enquiryServiceImpt
			 * .showEnquiry(userid); session.setAttribute("enquiries",
			 * enquiries);
			 * 
			 * //
			 * request.getRequestDispatcher("/ListEnquiries.jsp").forward(request
			 * , // response); response.sendRedirect("ListEnquiries.jsp");
			 * 
			 * }
			 */
		}

		else if (("Delete Selected!").equalsIgnoreCase(buttonName)) {

			/*String enquiryid = request.getParameter("deleteEnquiry");
			System.out.println(enquiryid);
		
			enquiryServiceImpt.delEnquiryById(userid,
					Integer.parseInt(enquiryid));*/

			
			  String[] string = request.getParameterValues("deleteEnquiry");
			  System.out.println(string);
			  
			  if(string==null){
				  request.getRequestDispatcher("/ListEnquiries.jsp").forward(request, response);
			  }
			  System.out.println(string.length);
			  for (int i = 0; i < string.length; i++) {
			  enquiryServiceImpt.delEnquiryById(userid,
			  Integer.parseInt(string[i])); }
			 
			
			ArrayList<Enquiry> enquiries = enquiryServiceImpt
					.showEnquiry(userid);
			session.setAttribute("enquiries", enquiries);
			response.sendRedirect("ListEnquiries.jsp");
		}

		else {

			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");

			String[] courses = request.getParameterValues("courses");
			StringBuffer buffer = new StringBuffer();
			if (!(name.isEmpty() || email.isEmpty() || contact.isEmpty()
					|| courses == null)) {
				for (int i = 0; i < courses.length; i++) {
					if (i < courses.length - 1) {
						buffer.append(courses[i] + ", ");
					} else {
						buffer.append(courses[i] + ". ");

					}
				}
				String course = buffer.toString();
				Enquiry enquiry = new Enquiry();
				enquiry.setContact(Long.parseLong(contact));
				enquiry.setCourses(course);
				enquiry.setEmail(email);
				enquiry.setName(name);
				enquiry.setUserid(userid);
				int check = enquiryServiceImpt.addEnquiry(enquiry);

				if (check == 0) {

					request.getRequestDispatcher("/addEnquiry.jsp").forward(
							request, response);

				} else {
					ArrayList<Enquiry> enquiries = enquiryServiceImpt
							.showEnquiry(userid);
					session.setAttribute("enquiries", enquiries);

					// request.getRequestDispatcher("/ListEnquiries.jsp").forward(request,
					// response);
					response.sendRedirect("ListEnquiries.jsp");

				}
			}else{
				request.getRequestDispatcher("/addEnquiry.jsp").forward(
						request, response);
				
			}
		}
	}

	/*
	 * // remove this metjhod and copy in post .. add else if
	 * 
	 * @Override protected void doGet(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException {
	 * PrintWriter out = response.getWriter(); HttpSession session =
	 * request.getSession(true);
	 * 
	 * // String button = request.getParameter("button");
	 * 
	 * int userid = (Integer) session.getAttribute("userid");
	 * 
	 * EnquiryServiceImpt enquiryServiceImpt = new EnquiryServiceImpt();
	 * 
	 * String enquiryid = request.getParameter("deleteEnquiry"); // for(String
	 * enq : enquiryid) System.out.println(enquiryid);
	 * 
	 * 
	 * for(int i=0;i<enquiryid.length;i++){
	 * enquiryServiceImpt.delEnquiryById(userid,
	 * Integer.parseInt(enquiryid[i])); } ArrayList<Enquiry>
	 * enquiries=enquiryServiceImpt.showEnquiry(userid);
	 * session.setAttribute("enquiries", enquiries);
	 * response.sendRedirect("ListEnquiries.jsp");
	 * 
	 * }
	 */

}
