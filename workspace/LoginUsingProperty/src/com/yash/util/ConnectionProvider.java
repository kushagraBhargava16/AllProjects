package com.yash.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.servlet.ServletContext;

public class ConnectionProvider {

	static Connection connection;
	ServletContext context;
	static String url="jdbc:mysql://localhost:3306/test";
	static String user="root";
	static String password="root";
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
