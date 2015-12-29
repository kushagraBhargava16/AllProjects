package generic;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter the Vehicle of your need:");
			System.out.println("1.Car,2.Truck,3.Bike");
			String choice=sc.next();
			
			if( choice.compareToIgnoreCase("car")==0 ){
				Car car=(Car)new FactoryVehicle().createVehicle(1);
				System.out.println("Your Car is:"+car);
			}
			else if (choice.compareToIgnoreCase("truck")==0) {
				Truck truck= (Truck)new FactoryVehicle().createVehicle(2);
				System.out.println("Your truck is:"+truck);
			}
			else if(choice.compareToIgnoreCase("bike")==0){
				Bike bike=(Bike) new FactoryVehicle().createVehicle(3);
				System.out.println("Your bike is:"+bike);
			}
			else{
				System.out.println("Please enter a correct vehicle");
			}
		
	}

}

class FactoryVehicle{
	public Vehicle createVehicle(int a)
	{
		
		Vehicle vehicle;
		switch(a){
		case 1:

			vehicle= new Car(4,"Audi");
			break;
		case 2:
			vehicle= new Truck(8,"Mecedez");
			break;
		case 3:
			vehicle= new Bike(2,"Harley Davidson");
			break;
			
		default:
			System.out.println("Please enter a valid value");
			vehicle=null;
		}
		return vehicle;
	}
}
