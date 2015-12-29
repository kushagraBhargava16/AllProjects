 abstract class Car{
	int noOfWheels=10;
	abstract void ignition();
	
	void changeGear(){
		System.out.println("The Cars change gear method");
		noOfWheels=11;
	}
}

class Sedan extends Car{
	void ignition(){
		System.out.println("The sedans's ignition method");
	}
}

abstract class SUV extends Car{
	abstract void fourWheelDrive();
}

class Safari extends SUV{
	 void fourWheelDrive(){
		 System.out.println("The Safari's 4wheel drive method");
	 }
}

class TestCars{
	public static void main(String[] args){
		Sedan s1=new Sedan();
		s1.ignition();
		s1.changeGear();
		System.out.println("The no of wheels in cars class by sedan class:"+s1.noOfWheels);
	}
}