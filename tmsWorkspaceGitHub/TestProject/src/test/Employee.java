package test;

import java.io.Serializable;

public class Employee extends Person implements Serializable  {

	private static final long serialVersionUID = 1L;
	private String name;
	private int id;

	private static Employee employee = new Employee();

	 
	private Employee() {
		 
	}

	public static Employee getInstance() {
		return employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object readResolve() {
		return employee;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	public void show() throws NullPointerException{
		
		System.out.println();
		throw new NullPointerException();
	}

}
