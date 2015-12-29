package generic;

public class Bike extends Vehicle {
int noOfWheels;
String name;
public Bike(int noOfWheels, String name) {
	super();
	this.noOfWheels = noOfWheels;
	this.name = name;
}
@Override
public String toString() {
	return "Bike [noOfWheels=" + noOfWheels + ", name=" + name + "]";
}


}
