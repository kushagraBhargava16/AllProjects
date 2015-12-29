package com.yash.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.domain.Employee;
import com.yash.util.util.DBUtil;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void setEmployeeDetails(Employee employee) {
		String sql = "insert into employee(employeeName,employeeAddress,employeeContact) values('" + employee.getName()
				+ "','" + employee.getAddress() + "','" + employee.getContact() + "')";
		System.err.println(sql);
		DBUtil.update(sql);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		String sql = "select * from employee";
		ResultSet resultSet = DBUtil.select(sql);
		try {
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt("employeeId"), resultSet.getString("employeeName"),
						resultSet.getString("employeeContact"), resultSet.getString("employeeAddress"));
				employees.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(employees);
		return employees;
	}

	@Override
	public void deleteSelectedEmployee(int[] values) {
		// TODO Auto-generated method stub
		for (int i = 0; i < values.length; ++i) {
			DBUtil.update("delete from employee where employeeId='" + values[i] + "'");
		}
	}

	@Override
	public Employee getEmployeeById(int updateId) {
		Employee employee = new Employee();
		String sql = "select * from employee where employeeId='" + updateId + "'";
		ResultSet resultSet = DBUtil.select(sql);
		try {
			while (resultSet.next()) {
				employee.setId(resultSet.getInt("employeeId"));
				employee.setName(resultSet.getString("employeeName"));
				employee.setAddress(resultSet.getString("employeeAddress"));
				employee.setContact(resultSet.getString("employeeContact"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public void updateEmployeeDetailsById(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "update employee set employeeName='" + employee.getName() + "', employeeContact='"
				+ employee.getContact() + "', employeeAddress='" + employee.getAddress() + "' where employeeId='"
				+ employee.getId() + "'";
		System.err.println(sql);
		DBUtil.update(sql);

	}

}
