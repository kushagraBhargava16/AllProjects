package com.yash.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static String url = "jdbc:mysql://localhost:3306/test";
	private static String user = "root";
	private static String password = "root";
	private static Connection connection;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			return connection;

		}

	}
}
