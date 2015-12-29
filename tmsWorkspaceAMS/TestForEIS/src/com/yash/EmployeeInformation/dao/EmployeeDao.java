package com.yash.EmployeeInformation.dao;

import java.sql.Connection;

import com.yash.EmployeeInformation.domain.Project;

public interface EmployeeDao {

	void saveNewProject(Project project);
	
}
