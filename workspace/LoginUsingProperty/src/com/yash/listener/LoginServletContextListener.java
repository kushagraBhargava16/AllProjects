package com.yash.listener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.yash.util.ConnectionProvider;


public class LoginServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent contextEvent) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent contextEvent) {
		ServletContext context = contextEvent.getServletContext();
		
		String url = context.getInitParameter("url");
		String user = context.getInitParameter("user");
		String password = context.getInitParameter("password");
		String path=context.getInitParameter("fileLocation");
		String filePath=context.getRealPath(path);
	//	System.out.println(url+user+password+filepath);
		 Connection connection=null;
		FileReader fileReader;
		Properties properties=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user,
					password);
			fileReader=new FileReader(filePath);
			 properties=new Properties();
			properties.load(fileReader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(connection);
		System.out.println(properties);
		
		context.setAttribute("connection", connection);
	
		context.setAttribute("properties",properties);
	}

}
