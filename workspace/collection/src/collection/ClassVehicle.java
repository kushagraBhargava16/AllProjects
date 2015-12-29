package collection;


class SUV

{

	public void show()
{

		System.out.println("hello from class suv");

}

}


class Sedan extends SUV

{

	public void show()

	{

		System.out.println("hello from class sedan");

	}

}


public class ClassVehicle {

	public static void main(String []args)

	{
	
		SUV suv=new SUV();
	
		Sedan sedan=new Sedan();
		SUV s=(SUV)sedan;

		if(sedan instanceof Sedan)

		{

			System.out.println("Comparison is successfull");

		}

	}
}