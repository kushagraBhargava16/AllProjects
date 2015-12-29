package Test;

public class MyClass {
	static int target=5000;
	public static void main(String[] args) {
		Thread male= new Thread(new NewThread());
		male.start();
		
	}
}
