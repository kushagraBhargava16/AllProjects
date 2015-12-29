package collection;

import java.util.Comparator;

public class ArrayComp implements Comparator {

	public int compare(Object o1, Object o2) {
		Employee emp = (Employee)o1;
		Employee emp1 = (Employee)o2;
		
		if(emp.getId()>emp1.getId())
		return (1);
		else return -1;
	}



	
}
