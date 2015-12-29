package Customer1;

import Customer2.*;

class Customer_test{
	public static void main(String[] args){
		Customer cust1=new Customer();
		System.out.println();
		Customer cust2=new Customer();
		System.out.println();
		System.out.println("Customer count by class:"+Customer.custCount);
		System.out.println();
		System.out.println("Customer id:"+cust1.custId);
		System.out.println();
		System.out.println("Customer count by object:"+cust1.custCount);
		System.out.println();
		//System.out.println("Customer name:"+cust1.custName);
		System.out.println("Customer city:"+cust1.city);
		System.out.println();
		System.out.println("Customer gender:"+cust1.gender);
			System.out.println();
		//System.out.println("The value of maximum phone allowed by obj:"+ new Customer().MAXPHONE);
		System.out.println();
		System.out.println("Customer count by class:"+Customer.custCount);
	
		
	}
}