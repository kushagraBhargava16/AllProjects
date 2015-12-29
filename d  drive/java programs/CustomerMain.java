class Customer{
    private int customercust;
	public int discount(int amt){
		
		amt=amt-(amt*20/100);
		return amt;
	}
	public int discount(int amt,String location){
		System.out.println("location:"+location);
		amt=amt-(amt*20/100);
		return amt;
	}
	public Customer getCustomer(Customer c){
		return c;
	}
}

class SilverCustomer extends Customer{
	public int discount(int amt){
		//System.out.println("Customer discount in silver"+super.discount(200));
		//System.out.println("Customer discount in silver"+super.discount(200,"bhopal"));
		amt=amt-(amt*10/100);
		return amt;
	
	}
}

class PlatinumCustomer extends Customer{
	public int discount(int amt){
		//System.out.println("Customer discount in silver"+super.discount(200));
		//System.out.println("Customer discount in silver"+super.discount(200,"bhopal"));
		amt=amt-(amt*10/100);
		return amt;
	
	}
}
class GoldCustomer extends Customer{
	public int discount(int amt){
		System.out.println("Customer discount in gold"+super.discount(200));
		System.out.println("Customer discount in gold"+super.discount(200,"jaipur"));
		amt=amt-(amt*5/100);
		return amt;
	
	}
}

class CustomerMain{
	public static void main(String...args){
		Customer cust1=new Customer();
		Customer cust=cust1;
		//System.out.println("Customer discount in main"+cust.discount(200));
		
		SilverCustomer scust=new SilverCustomer();
		cust=scust;
		//System.out.println("Silver discount "+cust.discount(200));
		
		GoldCustomer gcust=new GoldCustomer();
		cust=gcust;
		//System.out.println("Gold discount:"+cust.discount(200));
		
		Customer cust2=new Customer();
		//System.out.println("discount:"+cust2.discount(200,"indore"));
		
		cust=cust1;
		cust=(GoldCustomer)gcust.getCustomer(gcust);
		cust=(SilverCustomer)scust.getCustomer(scust);
		System.out.println();
		
		System.out.println("GetCustomer discount "+cust.discount(200));
	}
}