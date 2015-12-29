package Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
	
		map.put("Agatha",2000 );
		map.put("Becky",5000 );
		map.put("Cathy",1000 );
		map.put("David",7000 );
		map.put("Ester",4000 );
		map.put("Fletcher",1500 );
		map.put("Gwen",8000 );
		map.put("Harry",7050 );
		map.put("Harry",7000 );
		
		System.out.println(map);
	}

}
