package com.yash.ecommerce.services;

import com.yash.ecommerce.domain.User;

public interface UserService {
	public String authentication(String username,String password);
	public String register(User user);
	public User getUser(String username);

}
