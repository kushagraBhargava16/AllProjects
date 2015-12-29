package com.yash.ecommerce.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yash.ecommerce.domain.User;
import com.yash.ecommerce.services.CartService;
import com.yash.ecommerce.services.UserService;

@ManagedBean
@SessionScoped
public class UserBeans {
	public UserBeans() {
	UserBeans userBeans=null;
	}

	User user = new User();
	
	HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Inject
	UserService service;
	@Inject
	CartService cartService;
	public String checkLogin() {
		// service.authentication(username, password);
		// System.out.println(this.user.getName());

		session.setAttribute("user", user);
		// System.out.println(user);
		String check = service.authentication(user.getUsername(),
				user.getPassword());
		System.out.println(check);
		
		if (check.equalsIgnoreCase("home")) {
			setUser(service.getUser(user.getUsername()));
			return check;
		} else {
			return "index.xhtml?error=Login failed! Invalid username or password faces-redirect=true";
		}
	}

	
	public String register() {

		return service.register(user);
	}

}
