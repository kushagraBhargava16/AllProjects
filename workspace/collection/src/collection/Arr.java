package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Arr{

	public static void main(String[] arg) {
		
		String[] str={"palash","garg","is","Awsome"};
		List<String> list1=new ArrayList<String>(Arrays.asList(str));
		
		System.out.println(list1);
		
		List<Employee> list = (new  ArrayList<Employee>());
		
		list.add(new Employee(105, "Raam"));
		list.add(new Employee(102, "lakhan"));
		list.add(new Employee(103, "karan"));
		list.add(new Employee(104, "arjun"));
		Collections.sort(list,new ArrayComp());
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder(new ArrayComp()));
		System.out.println(list);
		
		Object[] object = list.toArray();
		for(Object o : object){System.out.println(o);}
		
		Employee[] empObjects = new Employee[3];
		empObjects[0] = new Employee(201,"Emp 1");
		empObjects[1] = new Employee(202,"Emp 2");
		empObjects[2] = new Employee(203,"Emp 3");
		
		List emp_list = new ArrayList(Arrays.asList(empObjects));
		
		List synList = Collections.synchronizedList(emp_list);
		
		System.out.println(emp_list);
		
		System.out.println(synList);
	}	
}

