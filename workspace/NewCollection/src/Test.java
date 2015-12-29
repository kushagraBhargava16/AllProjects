import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class Test {

	public static void main(String[] args) {
Integer integer= new Integer(10);
ArrayList hashSet=new ArrayList();
hashSet.add(integer);
LinkedList set=new LinkedList();
	set.add(integer);
	if(hashSet.equals(set)){
		System.out.println("Equals");
	}else{
		System.out.println("not");
	}
	}

}
