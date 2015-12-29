package Miscellenious;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
	public static void main(String []str){
		TreeSet treeset= new TreeSet();
		treeset.add(89);
		treeset.add(19);
		treeset.add(29);
		treeset.add(39);
		treeset.add(49);
		treeset.add(99);
		Iterator iterator= treeset.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
