package generic;

public class Car extends Vehicle {

	
	int noOfWheel;
	String name;
	
	
	public Car(int noOfWheel, String name) {
		
		this.noOfWheel = noOfWheel;
		this.name = name;
	}

	public int getNoOfWheel() {
		return noOfWheel;
	}
	
	@Override
	public String toString() {
		System.out.println("");
		return "Car [noOfWheel=" + noOfWheel + ", name=" + name + "]";
	}
	
	

	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
