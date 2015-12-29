package com.yash.bpd.classes;

public class Laptop {
	String companyName;
	RAM ram;
	HardDisk hardDisk;
	Processor processor;
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public HardDisk getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop \n Company Name:" + companyName + "\n"  + ram + "\n" + hardDisk + "\n"
				+ processor ;
	}
	
}
