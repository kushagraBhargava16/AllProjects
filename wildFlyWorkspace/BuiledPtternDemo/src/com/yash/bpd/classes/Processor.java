package com.yash.bpd.classes;

public class Processor {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Processor:" + name;
	}
	
}
