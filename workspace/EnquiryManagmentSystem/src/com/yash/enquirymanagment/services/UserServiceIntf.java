package com.yash.enquirymanagment.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.yash.enquirymanagment.domain.User;
import com.yash.enquirymanagment.util.ConnectionProvider;

public interface UserServiceIntf {
	
	
	public User userAuthenticatioin(String username,String password);
	
	public int userRegistration(User user);
	
	public int delUser(User user);
	
	public ArrayList showUsers();
	
}
