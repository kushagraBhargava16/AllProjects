package collection;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class RemoveDuplicateObject {
	public static void main(String[]args){
		ArrayList arraylist=new ArrayList();
		
		arraylist.add("Integer");
		arraylist.add("String");
		arraylist.add("Double");
		arraylist.add("Double");
		arraylist.add("Float");
		
		System.out.println(arraylist);
		
		LinkedHashSet lhs=new LinkedHashSet(arraylist);
		
		System.out.println(lhs);
	}
}