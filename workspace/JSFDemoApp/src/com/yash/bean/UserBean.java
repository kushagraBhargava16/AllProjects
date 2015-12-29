package com.yash.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UserBean {
	private String name;
	private String address;
	
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
	public String showUser(){
		try{  
            Class.forName("com.mysql.jdbc.Driver");    
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newtest","root","root"); 
            PreparedStatement ps=con.prepareStatement("INSERT INTO user VALUES (?,?)");
            ps.setString(1, name);
            ps.setString(2, address);
            ps.executeUpdate();
            
        }
        
        catch(Exception e){ 
            System.out.println(e);
        }
		return name;
	}
	
	public String display(){
		System.out.println("hello");
		return "display";
	}
}
