package Miscellenious;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class ArrayCollection {

	public static void main(String[] args) {
		Integer [] array=new Integer[]{12,234,45,56,67,78};
		
		List list = Arrays.asList(array);
		
		System.out.println(list);
		
		List arraylist= new ArrayList();
		
		arraylist.add(01);
		arraylist.add(02);
		arraylist.add(03);
		arraylist.add(04);
		arraylist.add(05);
		
		Object ar[]= arraylist.toArray();
		
		for(Object a:ar){
			System.out.println(a);
		}
	


	}

}
