package Employee;

import java.util.Comparator;

public class CompareAge implements Comparator {

	public int compare(Object o1, Object o2) {
		YashEmploy emp1=(YashEmploy) o1;
		YashEmploy emp2 =(YashEmploy) o2;
		if(emp1.getAge()>emp2.getAge())
			return (1);
			else return -1;
	}

}
