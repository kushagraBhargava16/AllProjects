package stringOperation;

public class StringCharCount {
	String str="Hello world to java";
	char c1='o';
	int c=0;
	void count(){
		for(int i=0;i<str.length();i++){
			if(c1==str.charAt(i)){
				++c;
			}
		}
		System.out.println("The count of character '"+c1+"' is "+c);
	}
}
