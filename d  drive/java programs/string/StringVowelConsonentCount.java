package stringOperation;

public class StringVowelConsonentCount {
	String str="Behaviour";
	int c=0,v=0;
	void count(){
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
			   str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
				++v;
			}
			else {
			c++;
			}
		}
		System.out.println("The string is "+str);
		System.out.println("The number of vowels are :"+v+" and the number of consonent are:"+c);
	}
}
