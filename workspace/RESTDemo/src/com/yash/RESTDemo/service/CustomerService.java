package com.yash.RESTDemo.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customerService")
public class CustomerService {
	
	@GET
	//@Path("/customers")
	@Produces(MediaType.APPLICATION_XML)
	public String getCustomers() {
		String a = "hello";
		return a;

	}
}
