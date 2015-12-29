package com.yash.EmployeeInformation.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.EmployeeInformation.domain.Project;
import com.yash.EmployeeInformation.service.EmployeeServiceLocal;

@ManagedBean
@SessionScoped
public class ManagerBean {

	private List<Project> projects;
	/*private String projectName;
	private String projectDuration;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}
*/
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;

	}

	@PostConstruct
	public void getAllEmployees() {

	}
	
/*	@EJB
	EmployeeServiceLocal employeeService;
	*//**
	 * @author kushagra.bhargava 
	 * 		   This method will save the project details to the database. 
	 *         It sends the object of project to the service layer.
	 * @return a string for the page redirection
	 *//*
	public String saveProject() {
		Project project = new Project(0, projectName, projectDuration);
		employeeService.createNewProject(project);
		return "projectDetails.xhtml?faces-redirect=true";
	}*/

}
