package collection;


import java.util.*;

public class ReadFromTreeSet {
	
public static void main(String[]args){	
		
		TreeSet tree = new TreeSet();
		tree.add(12);
		tree.add(63);
		tree.add(34);
		tree.add(45);
		 
		
		Iterator iterator = tree.iterator();
		//ListIterator litr = tree.listIterator(iterator);
		System.out.print("Tree set data: ");
		
		while (iterator.hasNext()) {
		    System.out.print(iterator.next() + " ");
		}
		}
	
	
}
