package com.yash.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserBean {
 private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 public String show(){
	 System.out.println("Hello "+name );
	 return "display";
 }
}
