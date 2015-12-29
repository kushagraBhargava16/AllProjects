package compare;

import java.util.Comparator;

public class Sorting implements Comparator{

	public int compare(Object arg0, Object arg1) {
		Customer c1 = (Customer)arg0;
		Customer c2 = (Customer)arg1;
		
		String c1Name = c1.getName();
		String c2Name = c2.getName();
		
		 return (c1Name.compareTo(c2Name));
	}

}
