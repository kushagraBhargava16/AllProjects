package com.yash.Main;


import com.yash.bpd.classes.Laptop;
import com.yash.builder.LaptopBuilder;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Configure your own laptop-----------");
		LaptopBuilder builder=new LaptopBuilder();
		Laptop laptop=builder.createLaptop();
		System.out.println("----Congratulations! Your laptop is ready----");
		System.out.println(laptop);
	}

}
