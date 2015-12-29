package com.yash.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustemerServlet
 */
@WebServlet("/CustemerServlet.do")
public class CustemerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=getServletContext();
		PrintWriter out=response.getWriter();
		Connection connection=(Connection) context.getAttribute("connection");
		String query="select * from customerRecord where id=?";
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			String gotPassword="*9*000181";
			while(resultSet.next()){
				gotPassword=resultSet.getString("password");
			}
			if(password.equals(gotPassword)){
				out.println("Welcome!"+id.toUpperCase());
			}else{
				out.print("Login failed!");
			}
			Cookie cookie[]=request.getCookies();
			for (Cookie cookie2 : cookie) {
				out.println(cookie2.getValue());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
