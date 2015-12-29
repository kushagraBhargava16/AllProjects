package com.yash.EmployeeInformation.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.yash.EmployeeInformation.dao.EmployeeDao;
import com.yash.EmployeeInformation.domain.Project;

/**
 * Session Bean implementation class EmployeeService
 */
@Stateless
@LocalBean
public class EmployeeService implements EmployeeServiceLocal {

	@Inject
	EmployeeDao employeeDao;
    /**
     * Default constructor. 
     */
    public EmployeeService() {
        // TODO Auto-generated constructor stub
    }

  /*  *//**
     * @author kushagra.bhargava
     * 
     * this method convert the project details in to a query string to store it in Database.
     * 
     * It takes a project object as a argument.
     *//*
	@Override
	public void createNewProject(Project project) {
		// TODO Auto-generated method stub
		employeeDao.saveNewProject(project);
	}*/

}
