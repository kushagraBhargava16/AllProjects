class Employee{
	String name;
	int salary;
	void getDetail(){
	}
}

class Manager extends Employee{
	String name="Paul";
	int salary=100000;
	void getDetail(){
		System.out.println("The name of the manager is: "+name);
		System.out.println("The salary of the manager is: "+salary);
	}
}

class Developer extends Employee{
	String name="Steave";
	int salary=10000;
	void getDetail(){
		System.out.println("The name of the developer is: "+name);
		System.out.println("The salary of the developer is: "+salary);
	}
}

class Trainee extends Employee{
	String name="Bill";
	int salary=1000;
	void getDetail(){
		System.out.println("The name of the trainee is: "+name);
		System.out.println("The salary of the trainee is: "+salary);
	}
}

class TestEmployee{
	public static void main(String...args){
		Employee emp;
		emp=new Manager();
		emp.getDetail();
		emp=new Developer();
		emp.getDetail();
		emp=new Trainee();
		emp.getDetail();
	}
}