package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class YashEmployMain {
	public static void main(String[]args){
		
		ArrayList arraylist = new ArrayList();
		
		YashEmploy employ1= new YashEmploy(1, "Adam", 30, 2000d);
		YashEmploy employ2= new YashEmploy(2, "Betsy", 22, 1500d );
		YashEmploy employ3= new YashEmploy(3, "Cara", 40, 1700d );
		YashEmploy employ4= new YashEmploy(4, "Dave", 33, 9000d );
		YashEmploy employ5= new YashEmploy(5, "Elane", 28, 500d);
		YashEmploy employ6= new YashEmploy(6, "Fleur", 54, 6000d );
		YashEmploy employ7= new YashEmploy(7, "Giovani",12, 7500d );
		YashEmploy employ8= new YashEmploy(8, "Heather",27,900d );
		YashEmploy employ9= new YashEmploy(9, "Igor",90,8900d );
		YashEmploy employ10= new YashEmploy(10, "Jack",43,3222d );
	
		arraylist.add(employ1);
		arraylist.add(employ2);
		arraylist.add(employ3);
		arraylist.add(employ4);
		arraylist.add(employ5);
		arraylist.add(employ6);
		arraylist.add(employ7);
		arraylist.add(employ8);
		arraylist.add(employ9);
		arraylist.add(employ10);
		
		  
		Iterator it = arraylist.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next()+" ");
			 
		 }
		 System.out.println("By salary:");
		 Collections.sort(arraylist, new SalaryCompare());	 
		 System.out.println(arraylist);
		 System.out.println("By age:");	
		 //System.out.println(arraylist);
		 Collections.sort(arraylist, new AgeCompare());
		 System.out.println(arraylist);
	}
}

