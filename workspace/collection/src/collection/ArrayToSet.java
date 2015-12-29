package collection;
import java.util.*;

public class ArrayToSet {
	public static void main(String[] args) {
		Integer[] numbers = { 1,2,3,4,50,60,47,28,9,10 ,1,2,3};

		List list = Arrays.asList(numbers);
		System.out.println(list + ", ");

		Set set = new HashSet(list);
		//set.add(100);
		//set.add(500);

		System.out.println(set);

	}
}
