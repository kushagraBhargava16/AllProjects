package com.yash.bpd.classes;

public class RAM {
	
	private int size;
	
	private String company;

	@Override
	public String toString() {
		return "RAM [size=" + size + ", company=" + company + "]";
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
