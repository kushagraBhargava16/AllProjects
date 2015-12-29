package com.yash.enquirymanagment.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.enquirymanagment.domain.Enquiry;
import com.yash.enquirymanagment.util.DBUtil;

public class EnquiryServiceImpt implements EnquiryServiceIntf {

	@Override
	public int addEnquiry(Enquiry enquiry) {
		String sql = "insert into enquiry(name,contact,userid,email,courses) value('"
				+ enquiry.getName()
				+ "','"
				+ enquiry.getContact()
				+ "','"
				+ enquiry.getUserid()
				+ "','"
				+ enquiry.getEmail()
				+ "','"
				+ enquiry.getCourses() + "')";
		//System.out.println(sql);
		DBUtil dbUtil=new DBUtil();
		int check=dbUtil.update(sql);
		return check;
	}

	@Override
	public int delAllEnquiryById(int userid) {
String sql="delete from enquiry where userid='"+userid+"'";
DBUtil dbUtil=new DBUtil();
int check=dbUtil.update(sql);

		return check;
	}

	@Override
	public ArrayList showEnquiry(int userid) {
		String sql="select * from enquiry where userid='"+userid+"' ";
		DBUtil dbUtil=new DBUtil();
		ResultSet resultSet=dbUtil.select(sql);
		ArrayList enquiries=new ArrayList();
		try {
			while(resultSet.next()){
				Enquiry enquiry=new Enquiry();
				
				enquiry.setContact(resultSet.getLong("contact"));
				enquiry.setCourses(resultSet.getString("courses"));
				enquiry.setEmail(resultSet.getString("email"));
				enquiry.setEnquiryid(resultSet.getInt("enquiryid"));
				enquiry.setName(resultSet.getString("name"));
				enquiry.setUserid(resultSet.getInt("userid"));
				enquiries.add(enquiry);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return enquiries;
	}

	@Override
	public int delEnquiryById(int userid,int enquiryid) {
		String sql="delete from enquiry where userid='"+userid+"' and enquiryid='"+enquiryid+"'";
		DBUtil dbUtil=new DBUtil();
		int check=dbUtil.update(sql);

				return check;		
	}

}
