package Miscellenious;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListRemoveDuplicate {
	public static void main(String[] args){
		List arraylist= new ArrayList();
		arraylist.add(90);
		arraylist.add(90);
		arraylist.add(89);
		arraylist.add(91);
		arraylist.add(29);
		arraylist.add(29);
		arraylist.add(90);
		System.out.println(arraylist); // before removing duplicate
		LinkedHashSet linkedHashSet = new LinkedHashSet(arraylist);
		System.out.println(linkedHashSet);
/*
		LinkedHashSet linkedHashSet1 = new LinkedHashSet(Arrays.asList(arraylist));
		System.out.println(linkedHashSet1);
*/	}
}
