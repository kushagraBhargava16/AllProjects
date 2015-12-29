package com.yash.EmployeeInformation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.sql.DataSource;

import com.yash.EmployeeInformation.domain.Project;
import com.yash.EmployeeInformation.util.ConnectionUtil;

/**
 * 
 * @author prakhar.jain
 *
 */
public class EmployeeDaoImpl implements EmployeeDao {

	@Inject
	ConnectionUtil connectionUtil;

	/**
	 * @author kushagra.bhargava
	 * 
	 *   This method will take a project object as argument
	 *   This method will convert the project object into query string
	 */

	@Override
	public void saveNewProject(Project project) {
		// TODO Auto-generated method stub
		String sql = "insert into projectDetails(projectName , projectDuration) values('" + project.getProjectName()
				+ "','" + project.getProjectDuration() + "')";
		Connection connection = connectionUtil.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
