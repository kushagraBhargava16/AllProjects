package stringOperation;

public class StringReverse {
	String str="Java is best programming language";
	
	int index=str.indexOf(" ");
	
	String str1=str;
	 
	public void reverse(){
	//System.out.println("kushagra");
		for(int i=0;i<str.length()-1;i++){
			
			if(str.lastIndexOf(" ")==str.length()-1){
				
				System.out.println(" "+str.substring(0,str.indexOf(" ")));
				break;
			}
			else
			{
				System.out.print(str.substring(str.lastIndexOf(" "),str.length()));
				str=str.substring(0,str.lastIndexOf(" "));
			}
		}
	}
}
