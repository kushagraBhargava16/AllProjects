package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedList {
	
	 

	 
	  public static void main(String[] args) {
	  // create set
	  Set set = new HashSet();
	     
	  // populate the set
	  set.add("palash");
	  set.add("is");
	  set.add("a");
	  set.add("boy");
	     
	     
	  // create a synchronized set
	  Set synchronizedset = Collections.synchronizedSet(set);
	    
	  System.out.println("Synchronized set is :"+synchronizedset);
	 }
	}

