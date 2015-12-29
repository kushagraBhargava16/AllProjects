class Employee{
	private int empId=1;
	private String empName="Nikhil";
	private static int empCount=0;
	
	public Employee(int a,String name){
		this.empId=a;
		this.empName=name;
		
	}
	 Employee(){
		
	}	
	
	
	protected Employee(int a){
		System.out.println(a);
		System.out.println("ak");
		
	}
	
	
	public int getEmpId(){
		return empId;
	}
	
	public void setEmpId(int empid){
		this.empId=empid;
	}
	
	public void print(){
		System.out.println("Employee id :"+empId);
		System.out.println("Employee name :"+empName);
	}
	
	public static void printCount(){
		System.out.println("Employee count :"+empCount);
	}
	
	public static void increament(){
		++empCount;
	}
	
	public void printList(String...ar){
		for(int i=0;i<ar.length;i++){
				System.out.println(ar[i]);
		}
	}
	
	public boolean equals(Object obj){
		
		Employee emp1=new Employee();
		emp1=(Employee)obj;
		if(emp1.empName==this.empName)
			return true;
			return false;
		
	}
}



