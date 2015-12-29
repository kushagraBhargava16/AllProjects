package generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Vehicle> vehiclelist= new ArrayList<Vehicle>();
		vehiclelist.add(new Car(1,"city"));
		vehiclelist.add(new Car(2,"civic"));
		vehiclelist.add(new Car(3,"ford"));
		vehiclelist.add(new Vehicle(4,"mustang"));
		vehiclelist.add(new Vehicle(5,"audi"));
		
		Detail detail= new Detail();
		detail.show(vehiclelist);
		
		List<Truck> trucklist= new ArrayList();
		trucklist.add(new Truck(10, "Mercedez"));
		trucklist.add(new Truck(6, "BMW"));
		trucklist.add(new Truck(8, "Audi"));
		trucklist.add(new Truck(12, "Mustang"));
		
		detail.show(trucklist);
		
		//Car c=new Vehicle();
	}

}
