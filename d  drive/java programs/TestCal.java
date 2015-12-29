interface Calculator{
	float Result=(float)10.0;
	public int sum();
	
	public float divide();
}

interface ScientificCalculator {
	public int substract();
	
	public float multiply();
}

class Calculate implements Calculator,ScientificCalculator{
	public int sum(){
		return 10;
	}
	public float divide(){
		return Result;
	}
	public int substract(){
		return 10;
	}
	
	public float multiply(){
		return Result;
	}
}

class TestCal{
	public static void main(String...args){
		Calculate cal=new Calculate();
		System.out.println(cal.Result);
		System.out.println(cal.divide());
		Calculator c=new Calculate();
		System.out.println(c.Result);
		
	}
	
}


