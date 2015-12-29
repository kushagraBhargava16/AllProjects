//Sorting and insertion
package newCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListString {

	public static void main(String[]args){
	
	Student student1=new Student(102,"kush",22);
	Student student2=new Student(108,"sam",21);
	Student student3=new Student(101,"joe",28);
	Student student4=new Student(103,"fil",23);
	Student students[]={student1,student2,student3,student4};
	
	List list=new ArrayList(Arrays.asList(students));
		print(list);// print the list.
	list=sortArray(list);//Sorted array by id
		print(list);	
	list=reverseSortArray(list);//get the array in reverse order
		print(list);
	}
	
	static List sortArray(List al){
		int c,d, swap ,size= al.size();
		 
		for (c = 0; c < (size - 1 ); c++) {
		      for (d = 0; d < size - c - 1; d++) {
		    	Student s1= (Student)al.get(d);
		    	Student s2= (Student)al.get(d+1);
		    	if(s1.getId()>s2.getId()) /* For descending order use < */
		        {
		          swap = s1.getId();
		          s1.setId(s2.getId());
		          s2.setId(swap);
		        }
		      }
		    }
		return al;
	}
	
	static List reverseSortArray(List al){
		int c,d, swap ,size= al.size();
		 
		for (c = 0; c < (size - 1 ); c++) {
		      for (d = 0; d < size - c - 1; d++) {
		    	Student s1= (Student)al.get(d);
		    	Student s2= (Student)al.get(d+1);
		    	if(s1.getId()<s2.getId()) /* For descending order use < */
		        {
		          swap = s1.getId();
		          s1.setId(s2.getId());
		          s2.setId(swap);
		        }
		      }
		    }
		return al;
	}
	
	static void print(List list){
		
		for(int i=0;i<list.size();i++){
			Student s=(Student) list.get(i);
			System.out.print(s.getId()+",");
			System.out.print(s.getName()+",");
			System.out.println(s.getAge());
		}
		System.out.println("");
		System.out.println("");
	}
}
