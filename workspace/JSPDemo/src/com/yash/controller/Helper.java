package com.yash.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.domain.Customer;

public class Helper {
	static void doProcess(HttpServletRequest request,HttpServletResponse response,Customer customer){
		try {
			PrintWriter out=response.getWriter();
			out.print("Customer info: "+customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
