package com.yash.bpd.classes;

public class HardDisk {
	private int size;
	private String company;

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

	@Override
	public String toString() {
		return "HardDisk [size=" + size + ", company=" + company + "]";
	}

}
