package com.yash.builder;

import com.yash.bpd.classes.HardDisk;
import com.yash.bpd.classes.Laptop;
import com.yash.bpd.classes.Processor;
import com.yash.bpd.classes.RAM;

import java.util.Scanner;

public class LaptopBuilder {

	public Laptop createLaptop() {
		Laptop laptop = new Laptop();
		System.out.println("Enter the company of the laptop:");
		Scanner sc = new Scanner(System.in);
		String companyName = sc.next();
		laptop.setCompanyName(companyName);
		RAM ram = new RAM();
		System.out.println("Enter the company name of RAM you want:");
		String ramCompany = sc.next();
		System.out.println("Enter the size of RAM you want:");
		int ramSize = sc.nextInt();
		ram.setCompany(ramCompany);
		ram.setSize(ramSize);
		laptop.setRam(ram);
		HardDisk hardDisk = new HardDisk();
		System.out.println("Enter the company name of HD you want:");
		hardDisk.setCompany(sc.next());
		System.out.println("Enter the size of HD you want:");
		hardDisk.setSize(sc.nextInt());
		laptop.setHardDisk(hardDisk);
		Processor processor=new Processor();
		System.out.println("Enter the type of processor you want:");
		processor.setName(sc.next());
		laptop.setProcessor(processor);
		return laptop;
	}

}
