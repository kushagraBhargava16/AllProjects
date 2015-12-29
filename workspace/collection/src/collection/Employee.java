package collection;


class Employee implements Comparable{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public int compareTo(Object o) {
	
		
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id:"+id+", Name: "+name;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee emp=(Employee)o;
		return this.name.compareTo(emp.name);
	}
	
	}



	
	
	
	
