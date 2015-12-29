package com.yash.EmployeeInformation.service;

import javax.ejb.Local;

import com.yash.EmployeeInformation.domain.Project;

@Local
public interface EmployeeServiceLocal {

	void createNewProject(Project project);

}
