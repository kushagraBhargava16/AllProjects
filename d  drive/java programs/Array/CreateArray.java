class CreateArray{
	public Customer[] create(Object[] o){
		Customer [] array=(Customer[]) o;
		Customer [] temp;
		int a,n=0;
		int s;
		//Scanner sc=new Scanner(System.in);
	
		System.out.println("Please enter a value :");
		//a=sc.nextInt();
		array[n]=a;
		n++;
		System.out.println("Do you want to conti. press 1");
		//s=sc.nextInt();
		if(s==1){
			temp=new Customer[array.length];
			System.arraycopy(array,0,temp,0,array.length);
			array= new Customer[n+1];
			System.arraycopy(temp,0,array,0,temp.length);
			
		}
		
	
	}
}