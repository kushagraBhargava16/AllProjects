package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {
	public static void main(String[]args){
		String Array[] = new String []{"Integer", "String", "Double", "Double"};
		  List list = Arrays.asList(Array);
	      System.out.println(list);
	      
	      
	      	List strList = new ArrayList();
			strList.add("Integer");
			strList.add("String");
			strList.add("Double");
			strList.add("Double");
			
			Object[] strArray = strList.toArray();
		//	System.out.println(strArray);
			for (Object str : strArray) {
				System.out.println(str);
				
				
		
				}

	}
}
