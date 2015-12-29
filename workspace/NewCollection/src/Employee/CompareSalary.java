package Employee;

import java.util.Comparator;

public class CompareSalary implements Comparator{

	public int compare(Object o1, Object o2) {
	YashEmploy emp1=(YashEmploy) o1;
	YashEmploy emp2 =(YashEmploy) o2;
	if(emp1.getSalary()>emp2.getSalary())
		return (1);
		else return -1;
	}

}
