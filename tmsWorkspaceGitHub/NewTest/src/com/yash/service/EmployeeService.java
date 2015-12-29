package com.yash.service;

import java.util.List;

import com.yash.domain.Employee;

public interface EmployeeService {

	void setEmployeeDetails(Employee employee);

	List<Employee> getAllEmployee();

	void deleteSelectedEmployee(int[] values);

	Employee getEmployeeById(int updateId);

	void updateEmployeeDetailsById(Employee employee);

}
