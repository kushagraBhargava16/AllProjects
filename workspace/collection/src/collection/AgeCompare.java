//Assigment 3.1 + comparator
package collection;

import java.util.Comparator;

public class AgeCompare implements Comparator {
	public int age;
	public AgeCompare(int age){
		this.age=age;
	}

	public AgeCompare() {
		// TODO Auto-generated constructor stub
	}

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		YashEmploy yashemploy1=(YashEmploy)o1;
		YashEmploy yashemploy2=(YashEmploy)o2;
		
		if(yashemploy1.age>yashemploy2.age)
			return 1;
		else
			return -1;
		
	}
	}