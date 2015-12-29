package Customer2;

public class Customer{
	public int custId=101;
	public String custName="Nikhil";
	public String city="Indore";
    public String gender="Female";
	public static int custCount=0;
	public final int MAXPHONE;
	Address ad1;
	Contact con1;
	
	public Customer(){
	
	System.out.println("Inside Customer constructor ");
	System.out.println();
	MAXPHONE=3;
	//ad1=new Address();
	//con1=new Contact();
	++custCount;
	//ad1.show();
	System.out.println("Count of customer"+custCount);
	System.out.println("End of Customer constructor");
	}
		
	public void print(){
		
		System.out.println("Inside Print Method");
		System.out.println();
		System.out.println("Max no. of phones allowed:"+MAXPHONE);
		System.out.println();
		System.out.println("Count of customer"+custCount);
		System.out.println("Print end.");
		System.out.println();
	}
private class Address{
		
		private void show(){
			System.out.println("Address method");
		}
	}
	
private class Contact{
		Contact(){
				System.out.println("Contact");
		}
	}
	
}

