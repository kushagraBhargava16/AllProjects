package com.yash.ecommerce.dao;

import com.yash.ecommerce.beans.UserBeans;
import com.yash.ecommerce.domain.User;

public interface UserDAO {

	public User authenticateUser(String username,String password);
	public String InsertUser(User user);
	public User getUser(String username);

}
