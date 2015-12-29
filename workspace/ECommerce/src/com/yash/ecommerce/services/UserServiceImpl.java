package com.yash.ecommerce.services;

import javax.inject.Inject;

import com.yash.ecommerce.beans.UserBeans;
import com.yash.ecommerce.dao.UserDAO;
import com.yash.ecommerce.dao.UserDAOimpl;
import com.yash.ecommerce.domain.User;

public class UserServiceImpl implements UserService {
	@Inject
	UserDAO dao;

	@Override
	public String authentication(String username, String password) {
		// System.out.println(username+password);

		
		User user = dao.authenticateUser(username, password);
		if (user != null) {

			return "home";

		}
		return "#";
	}

	@Override
	public String register(User user) {
		String check=dao.InsertUser(user);
		if(check!=null){
			return "index";
		}
		return null;
	}

	@Override
	public User getUser(String username) {
		User user=dao.getUser(username);
		return user;
	}
	

}
