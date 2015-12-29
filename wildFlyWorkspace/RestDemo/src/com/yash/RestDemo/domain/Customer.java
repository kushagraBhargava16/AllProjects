package com.yash.RestDemo.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	String name;
	String address;
	
	Customer(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
}
