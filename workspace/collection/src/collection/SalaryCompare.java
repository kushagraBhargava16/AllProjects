//Assigment 3.2 + comparator
package collection;


import java.util.Comparator;

public class SalaryCompare implements Comparator{
	
	public int salary;
	public SalaryCompare(int salary){
		this.salary=salary; 
	}

	public SalaryCompare() {
		// TODO Auto-generated constructor stub
	}

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		YashEmploy yashemploy1= (YashEmploy)o1;
		YashEmploy yashemploy2= (YashEmploy)o2;
		
		if(yashemploy1.salary>yashemploy2.salary)
		return 1;
		else
			return -1; 
		
	}}