import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class TestException {
	public static void main(String[] argv){
		//save();
		try{
			doCal(10);
			String str = argv[2];
			
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.err.println("Inside Array Catch "+a.getMessage());
			a.printStackTrace();
			throw new NullPointerException("Error accessing parameters");
		}
		/*catch(Exception e){
			System.out.println("Inside Exception Catch");
			e.printStackTrace();
		}*/
		
		finally{
			System.out.println("Inside finally");
		}
	}
	

	public static int doCal(int iVal){
		return 100/iVal;
	}
	
	public static void save(){
		try{FileOutputStream fout = new FileOutputStream("I:\\emp.dat");
	}
	catch(FileNotFoundException f){
		f.printStackTrace();
	}
	}
}

class NewException extends Exception{
	private int solution;
	public void getSol(){
		
	}
	public void setSol(){
		
	}
	
}
