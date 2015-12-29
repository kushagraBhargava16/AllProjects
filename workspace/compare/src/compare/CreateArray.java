package compare;

import java.util.ArrayList;

public class CreateArray {
	public Customer[] createArray(Object[] o){
		Customer [] customers=(Customer[]) o;
		Customer [] temp;
		int n=customers.length;
		/*int s;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Please enter a value :");
		a=sc.nextInt();
		
		array[n]=a;
		++n;
		System.out.println("Do you want to conti. press 1");
		s=sc.nextInt();
		*/
		++n;
			temp=new Customer[customers.length];
			System.arraycopy(customers,0,temp,0,customers.length);
			customers= new Customer[n];
			System.arraycopy(temp,0,customers,0,temp.length);
			
		return customers;

	
	}
}
