package com.yash.enquirymanagment.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.enquirymanagment.domain.User;
import com.yash.enquirymanagment.util.DBUtil;

public class UserServiceImpt implements UserServiceIntf {

	/*
	 *User authentication will check is the username and pass word exists in the data base.
	 *If yes the will return 1. otherwise 0. 
	 */
	@Override
	public User userAuthenticatioin(String username, String password) {

		
		User user=new User();
		String sql = "select * from user where (username='" + username+ "'and password='" + password + "')";
		System.out.println(sql);
		DBUtil dbUtil = new DBUtil();
		ResultSet resultSet = dbUtil.select(sql);
		try {
			if (resultSet.next()) {
				user.setEmail(resultSet.getString("email"));
				user.setName(resultSet.getString("name"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				user.setStatus(resultSet.getInt("status"));
				user.setType(resultSet.getInt("type"));
				user.setUserid(resultSet.getInt("userid"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("problem in user authentication");
		}
		return user;
	}

	@Override
	public int userRegistration(User user) {
		int check = 0;
		String name = user.getName();
		String username = user.getUsername();
		String password = user.getPassword();
		int type = user.getType();
		int status = user.getStatus();
		String email = user.getEmail();
		String sql = "insert into user(name,email,type,status,username,password) values('"
				+ name
				+ "','"
				+ email
				+ "','"
				+ type
				+ "','"
				+ status
				+ "','"
				+ username + "','" + password + "')";
		System.out.println(sql);
		DBUtil dbUtil = new DBUtil();
		check = dbUtil.update(sql);
		return check;
	}

	@Override
	public int delUser(User user) {
		String sql = "delete from user where username='" + user.getUsername()
				+ "'";
		DBUtil dbUtil = new DBUtil();
		int check = dbUtil.update(sql);
		return check;
	}

	@Override
	public ArrayList showUsers() {
		String sql = "select* from user";
		DBUtil dbUtil = new DBUtil();
		ResultSet resultSet = dbUtil.select(sql);
		ArrayList users = new ArrayList();
		try {
			while (resultSet.next()) {
				User user = new User();
				user.setEmail(resultSet.getString("email"));
				user.setName(resultSet.getString("name"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				user.setStatus(resultSet.getInt("status"));
				user.setType(resultSet.getInt("type"));
				user.setUserid(resultSet.getInt("userid"));
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
