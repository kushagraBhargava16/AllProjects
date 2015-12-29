package com.yash.enquirymanagment.domain;

public class Enquiry {
	private int enquiryid;
	private String name;
	private int userid;
	private String email;
	private long contact;
	private String courses;
	
	public int getEnquiryid() {
		return enquiryid;
	}
	public void setEnquiryid(int enquiryid) {
		this.enquiryid = enquiryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Enquiry [enquiryid=" + enquiryid + ", name=" + name
				+ ", userid=" + userid + ", email=" + email + ", contact="
				+ contact + ", courses=" + courses + "]";
	}
	
	
}
