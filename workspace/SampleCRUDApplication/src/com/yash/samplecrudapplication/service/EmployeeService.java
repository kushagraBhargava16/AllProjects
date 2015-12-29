package com.yash.samplecrudapplication.service;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.yash.samplecrudapplication.domain.Employee;

public interface EmployeeService {
	public ArrayList<Employee> getAllEmployee();

	public ArrayList<Employee> getEmployeeById(int id);

	public void updateEmployee(int id);

	public void insertEmployee(Employee employee);

	public void deleteEmployeeById(int id);

	public void deleteAllEmployee();
}
