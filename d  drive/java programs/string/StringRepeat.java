package stringOperation;

public class StringRepeat {
	String str="This is a greate journey of love and respect.";
	int length=str.length();
	int charIndex=str.indexOf(" ");
	int add=0;
	void count(){
		
		for(int i=0;i<length-1;++i){
			if(str.lastIndexOf(str.charAt(i))> str.indexOf(str.charAt(i))){
				if(str.indexOf(str.charAt(i))==i && str.indexOf(str.charAt(charIndex))!=str.indexOf(str.charAt(i)))
					{
						System.out.println(str.charAt(i));
					}
				
			}
		}
	}
	
}
