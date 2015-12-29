package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.domain.Employee;
import com.yash.domain.TechSupport;
import com.yash.util.ConnectionProvider;

public class TechSupportDAO {
	
	public void update(TechSupport support){
		Connection connection=ConnectionProvider.getConnection();
		String sql="insert into techsupport values(?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, support.getEmail());
			preparedStatement.setString(2, support.getSoftware());
			preparedStatement.setString(3, support.getOs());
			preparedStatement.setString(4, support.getDesciprtion());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet selectData(String sql){
		Connection connection=ConnectionProvider.getConnection();
		ResultSet resultSet=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			return resultSet;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return resultSet;
		}
		
	}
}
