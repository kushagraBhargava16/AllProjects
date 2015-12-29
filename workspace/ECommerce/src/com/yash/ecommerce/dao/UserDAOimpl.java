package com.yash.ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.ecommerce.domain.User;
import com.yash.ecommerce.util.DBUtil;

public class UserDAOimpl implements UserDAO {


	@Override
	public User authenticateUser(String username, String password) {
		// TODO Auto-generated method stub
		String sql = "select * from user where username='" + username
				+ "' and password='" + password + "'";
		// System.out.println(sql);
		User user = new User();
		ResultSet resultSet = DBUtil.select(sql);

		try {
			if (resultSet.next()) {
				while (resultSet.next()) {
					user.setUsername(resultSet.getString("username"));
					user.setPassword(resultSet.getString("password"));
					user.setName(resultSet.getString("name"));
					user.setAddress(resultSet.getString("address"));
					user.setContact(resultSet.getString("contact"));
					user.setEmail(resultSet.getString("email"));

				}
				return user;
			} else {
				return null;
			}
		} catch (SQLException e) {

			System.out.println("failed in dao");

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String InsertUser(User user) {
		String sql = "insert into user value('" + user.getUsername() + "','"
				+ user.getPassword() + "','" + user.getContact() + "','"
				+ user.getAddress() + "','" + user.getEmail() + "','"
				+ user.getName() + "')";
		System.out.println(sql);
		int check = DBUtil.update(sql);
		if (check != 0) {
			return "login";
		}
		return null;
	}

	@Override
	public User getUser(String username) {
		String sql = "select * from user where username='" + username + "'";
		System.out.println(sql);
		User user=new User();
		ResultSet resultSet=DBUtil.select(sql);
		try {
			while(resultSet.next()){
				user.setName(resultSet.getString("name"));
				user.setAddress(resultSet.getString("address"));
				user.setContact(resultSet.getString("contact"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				user.setUsername(resultSet.getString("username"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
