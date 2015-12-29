package com.yash.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UserBean {
private Address address=new  Address();

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
public void show(){
	System.out.println(address.getCity());
}
}
