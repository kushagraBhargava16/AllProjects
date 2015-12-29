package generic;

public class Vehicle{
	
	int noOfWheel;
	String name;
	
	public int getNoOfWheel() {
		return noOfWheel;
	}
	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}
	public Vehicle(){}
	public Vehicle(int noOfWheel, String name) {
		//super();
		this.noOfWheel = noOfWheel;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vehicle [noOfWheel=" + noOfWheel + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
