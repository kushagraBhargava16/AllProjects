package com.yash.enquirymanagment.services;

import java.util.ArrayList;

import com.yash.enquirymanagment.domain.Enquiry;

public interface EnquiryServiceIntf {
	
	public int addEnquiry(Enquiry enquiry);

	public int delAllEnquiryById(int userid);

	public int delEnquiryById(int userid,int enquiryid);

	public ArrayList showEnquiry(int userid);
}
