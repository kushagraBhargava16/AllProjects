package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.domain.Employee;
import com.yash.util.ConnectionProvider;

public class EmployeeDao {
	public ArrayList<Employee>getEmployeeById(int id){
		ArrayList<Employee> employees=new ArrayList<Employee>();
		String sql="select * from employeeDetails where id='"+id+"'";
		Connection connection=ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				Employee employee=new Employee();
				employee.setId(resultSet.getInt("id"));
				employee.setName(resultSet.getString("name"));
				employee.setContact(resultSet.getString("contact"));
				employees.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}
}
