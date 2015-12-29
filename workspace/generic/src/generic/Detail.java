package generic;

import java.util.List;

public class Detail{
	public void show(List<? extends Vehicle> list){
		System.out.println(list);
	}
}
