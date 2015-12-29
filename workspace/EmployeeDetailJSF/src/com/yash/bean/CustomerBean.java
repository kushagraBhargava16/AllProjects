package com.yash.bean;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped
public class CustomerBean {
	private String name;
	private String gender;
	private String contact;
	private String email;
	private String address;
	private String DOB;

	private int experience;
	private String[] technologies;
	private boolean terms;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String[] getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}

	public boolean isTerms() {
		return terms;
	}

	public void setTerms(boolean terms) {
		this.terms = terms;
	}

	public String add() {

		String techs = String.join(" ", technologies);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/newtest", "root", "root");
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO customer VALUES (?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, contact);
			ps.setString(4, email);
			ps.setString(5, address);
			ps.setString(6, DOB);
			ps.setInt(7, experience);
			ps.setString(8, techs);
			ps.executeUpdate();

		}

		catch (Exception e) {
			System.out.println(e);
		}
		return name;
	}
}
