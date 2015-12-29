package com.yash.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.domain.Employee;
import com.yash.service.EmployeeService;

@ManagedBean
@SessionScoped
public class EmployeeBean {
	private String name;
	private String contact;
	private String address;
	List<Employee> employees;

	@EJB
	EmployeeService employeeService;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String addEmployee() {
		System.err.println("hello--->" + name);
		Employee employee = new Employee(0, name, contact, address);
		employeeService.setEmployeeDetails(employee);
		return "#";
	}

	public String getAllEmployee() {
		employees = employeeService.getAllEmployee();

		return "details";
	}
}
