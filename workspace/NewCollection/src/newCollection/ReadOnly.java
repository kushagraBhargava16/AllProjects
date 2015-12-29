//ReadOnly & ThreadSafe
package newCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReadOnly {
	public static void main(String[] args){
		Collection list= new ArrayList();
		list.add("kushagra");
		list.add("bhargava");
		list.add("deepak");
		list.add("vishwakarma");
		System.out.println("Before unmodifiable");
		System.out.println(list);
		list=Collections.unmodifiableCollection(list);
		//list.remove("ghada");
		System.out.println("After unmodifiable");
		System.out.println(list);
		list=Collections.synchronizedCollection(list);
		System.out.println("After synchonized");
		System.out.println(list);
	}
}
