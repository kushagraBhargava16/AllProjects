package stringOperation;

public class StringDigit {
	String regx="[0-9]+";
	//String str="12345";
	public boolean check(String str){
		System.out.println();
		return str.matches(regx);
	}
}
