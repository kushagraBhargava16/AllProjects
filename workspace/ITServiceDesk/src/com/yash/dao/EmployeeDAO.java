package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yash.util.ConnectionProvider;

public class EmployeeDAO {
	public static void addEmployee(String sql){
		Connection connection=ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
