package com.yash.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.dao.TechSupportDAO;
import com.yash.domain.TechSupport;
import com.yash.util.ConnectionProvider;

/**
 * Servlet implementation class ResponseServlet
 */
@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    	HttpSession session=request.getSession(true);
    	String emailId=(String)session.getAttribute("emailId");
    	
    	String software=(String)session.getAttribute("software");
    	
    	String os=(String)session.getAttribute("os");
    	
    	String description=(String)session.getAttribute("description");
    	
    	PrintWriter printWriter=response.getWriter();
    	printWriter.println(description);
    	
    	TechSupportDAO dao=new TechSupportDAO();
    	String sql="select email from employee where email='"+emailId+"'";
    	ResultSet resultSet=dao.selectData(sql);
    	
    	try {
			if(resultSet.next()){
				
				TechSupport support=new TechSupport();
				support.setEmail(emailId);
				support.setDesciprtion(description);
				support.setOs(os);
				support.setSoftware(software);
				
				TechSupportDAO techDao=new TechSupportDAO();
				techDao.update(support);
				
				ServletContext application=getServletContext();
				RequestDispatcher dispatcher=application.getRequestDispatcher("/FinalServlet");
				dispatcher.forward(request, response);
			}
			else{
				ServletContext application=getServletContext();
				RequestDispatcher dispatcher=application.getRequestDispatcher("/register.html");
				dispatcher.forward(request, response);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
