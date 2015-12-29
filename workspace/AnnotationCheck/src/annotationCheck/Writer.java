package annotationCheck;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    
	@PutData(message="This is a file of put data.",path="D:\\Javafiles\\Hello.txt")
    void put(){
	//System.out.println("Where magic happens!");
	}
	
	@Greeting(count=4,name="Greetings My friends")
	void show(){
		//System.out.println("Show me the info.");
	}
  
}



