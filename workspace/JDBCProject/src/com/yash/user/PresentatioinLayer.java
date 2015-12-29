package com.yash.user;

import java.util.ArrayList;
import java.util.Scanner;

import com.yash.dao.CustomerDAO;
import com.yash.domain.Customer;

public class PresentatioinLayer {
	static int id = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = new CustomerDAO();

		int choice;
		do {
			System.out
					.println("1.Insert\n2.Show\n3.Update\n4.Delete\n5.Delete All Records\n0.Exit");
			choice = sc.nextInt();

			switch (choice) {

			case 1:// insert
				Customer customer = new Customer();
				System.out.println("Please enter the name of customer:");
				String name = sc.next();
				System.out.println("Please enter the address of customer:");
				String address = sc.next();
				customer.setName(name);
				customer.setAddress(address);
				customerDAO.save(customer);
				break;

			case 2:// Showing the data
				ArrayList<Customer> customerList = customerDAO.getCustomers();
				for (Customer customer2 : customerList) {
					System.out.println(customer2);
				}
				break;

			case 3:// Update by Id
				Customer customerUpdate = new Customer();
				System.out
						.println("Please enter the id of the customer to be updated:");
				int id = sc.nextInt();
				System.out.println("Please enter the name of customer:");
				String nameUpdate = sc.next();
				System.out.println("Please enter the address of customer:");
				String addressUpdate = sc.next();
				customerUpdate.setId(id);
				customerUpdate.setAddress(addressUpdate);
				customerUpdate.setName(nameUpdate);
				customerDAO.update(customerUpdate);
				break;

			case 4:// Delete by id
				System.out
						.println("Please enter the id of the customer to be deleted:");
				id = sc.nextInt();
				customerDAO.delete(id);
				break;

			case 5:// delete all
				customerDAO.deleteAll();
				break;

			case 0:// exit
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Input!");
			}
		} while (true);
		
	
	}

}
