package com.yash.samplecrudapplication.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.enterprise.inject.Default;

import com.yash.samplecrudapplication.domain.Employee;
import com.yash.samplecrudapplication.util.DBUtil;

@Default
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void insertEmployee(Employee employee) {
		String sql = "insert into employee values('" + employee.getEmployeeId()
				+ "','" + employee.getEmployeeName() + "','"
				+ employee.getEmployeeContact() + "','"
				+ employee.getEmployeeAddress() + "')";
		System.out.println(sql);
		DBUtil.update(sql);
	}

	@Override
	public void updateEmployee(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployeeById(int id) {
String sql="delete from employee where employeeId='"+id+"'";
DBUtil.update(sql);
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		String sql = "select * from employee";
		ResultSet resultSet = DBUtil.select(sql);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			while (resultSet.next()) {

				Employee employee = new Employee();
				employee.setEmployeeAddress(resultSet
						.getString("EmployeeAddress"));
				employee.setEmployeeContact(resultSet
						.getString("EmployeeContact"));
				employee.setEmployeeId(resultSet.getString("EmployeeId"));
				employee.setEmployeeName(resultSet.getString("EmployeeName"));
				employees.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public ArrayList<Employee> getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployee() {
		String sql = "truncate employee";
		DBUtil.update(sql);
	}

}
