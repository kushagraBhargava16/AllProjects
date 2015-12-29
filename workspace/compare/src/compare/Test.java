package compare;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	static int count=0;
	public static void main(String[] args) {
		int choice;
		
		Customer[] cust=new Customer[0];// this statement will create an array of object
		Scanner sc=new Scanner(System.in);
		int re=1;
		do{
		System.out.println("Please enter your coice :");
		System.out.println("1.Add nominy");
		System.out.println("2.Show nominy");
		choice=sc.nextInt();
		
		
		switch(choice){
			case 1:
				cust=add(cust);
				break;
			case 2:
				show(cust);
				break;
				
			default:
				
				System.out.println("Please enter a correct choice!");
				continue;
			
		}	
			System.out.println("Please enter 1 if you want to continue");
			re=sc.nextInt();
			
		}while(re==1);
		
	}
	
	static Customer[] add(Customer[] customer){
		
		Scanner sc=new Scanner(System.in);
		customer=new CreateArray().createArray(customer);
		System.out.println("Please enter your name :");
		String name=sc.next();
		System.out.println("Please enter your account number :");
		int account=sc.nextInt();
		customer[count]=new Customer();
		customer[count].setName(name);
		customer[count].setAccNo(account);
		++count;
		return customer;
	}
	
    static void show(Customer[] customer){
		
		//Arrays.sort(customer, new Sorting());
    	Arrays.sort(customer , new Sorting());
		for(int i=0;i<count;++i){

    		System.out.println("Name: "+customer[i].getName());
    		System.out.println("Account Number: "+customer[i].getAccNo());
    		
		}
	}

}
