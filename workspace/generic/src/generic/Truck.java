package generic;

public class Truck extends Vehicle{
	@Override
	public String toString() {
		System.out.println("");
		return "Truck [noOfWheel=" + noOfWheel + ", name=" + name + "]";
	}
	int noOfWheel;
	String name;
	public Truck(int noOfWheel, String name) {
		super();
		this.noOfWheel = noOfWheel;
		this.name = name;
	}
	public int getNoOfWheel() {
		return noOfWheel;
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
