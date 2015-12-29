package com.yash.SearchingEJB.domain;

public class Product {
	String name;
	String vendor;
	String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Product(String name, String vendor, String city) {
		super();
		this.name = name;
		this.vendor = vendor;
		this.city = city;
	}

	public Product() {

	}

	@Override
	public String toString() {
		return "Product Name:'" + name + "' Vendor:'" + vendor + "' City:'" + city + "'";
	}

}
