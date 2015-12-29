//Employee main package
package Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class EmployeeList {
	public static void main(String[]args){
		//creating 10 employee object
		YashEmploy employee1=new YashEmploy(new Integer(1),"palash",new Integer(22),new Double(79000));
		YashEmploy employee2=new YashEmploy(new Integer(2),"Deepak",new Integer(28),new Double(53000));
		YashEmploy employee3=new YashEmploy(new Integer(3),"nikhil",new Integer(12),new Double(65000));
		YashEmploy employee4=new YashEmploy(new Integer(4),"sameer",new Integer(22),new Double(30000));
		YashEmploy employee5=new YashEmploy(new Integer(5),"ramu s",new Integer(28),new Double(45000));
		YashEmploy employee6=new YashEmploy(new Integer(6),"falguni",new Integer(12),new Double(50000));
		YashEmploy employee7=new YashEmploy(new Integer(7),"honey",new Integer(22),new Double(60000));
		YashEmploy employee8=new YashEmploy(new Integer(8),"rahul",new Integer(28),new Double(75000));
		YashEmploy employee9=new YashEmploy(new Integer(9),"prateek",new Integer(12),new Double(80000));
		YashEmploy employee10=new YashEmploy(new Integer(10),"abhi",new Integer(12),new Double(90000));
		
		List list=new ArrayList();
		//adding employees to the list
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);
		
		Collections.sort(list);                       // Sorting on the basis of name by comparable
		System.out.println("After sorting by Name: ");
		iterator(list);//iterating the list
		
		Collections.sort(list,new CompareSalary());   // Sorting on the basis of salary by comparator
		System.out.println(" ");
		System.out.println("After sorting by salary: ");
		
		iterator(list);
		
		Collections.sort(list,new CompareAge());      // Sorting on the basis of age by comparator
		System.out.println(" ");
		System.out.println("After sorting by Age: ");
		
		iterator(list);
	}
	static void iterator(List l){
		Iterator iterartor=l.iterator();
		while(iterartor.hasNext()){
			System.out.println(iterartor.next());
			System.out.println("");
			//System.out.println("");
		}
		
	}
	
}
