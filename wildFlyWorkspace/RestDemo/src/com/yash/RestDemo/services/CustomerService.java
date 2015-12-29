package com.yash.RestDemo.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.RestDemo.domain.Customer;

@Path("/customerService")
public class CustomerService {
	List<Customer> customers = new ArrayList<Customer>();
	List<Customer> customers1 = new ArrayList<Customer>();
	List listOfList = new ArrayList();

	@GET
	@Path("/customers")
	@Produces(MediaType.APPLICATION_JSON)
	public List getCustomers() {
		Customer customer1 = new Customer("kushagra", "indore");

		Customer customer2 = new Customer("Nikhil", "indore");
		Customer customer3 = new Customer("Sethiya", "indore");
		Customer customer4 = new Customer("Deepak", "indore");
		Customer customer5 = new Customer("Dinesh", "indore");
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers1.add(customer2);
		customers1.add(customer3);
		customers1.add(customer4);
		customers1.add(customer5);
		listOfList.add(customers);
		listOfList.add(customers1);
		System.out.println(customer1);
		return listOfList;
	}

	@POST
	@Path("/users")
	@Consumes(MediaType.APPLICATION_JSON)
	public List setCustomer(List customer) {
		System.out.println(customer);
		System.out.println("object aa raha he!");
		return customer;
	}
}
