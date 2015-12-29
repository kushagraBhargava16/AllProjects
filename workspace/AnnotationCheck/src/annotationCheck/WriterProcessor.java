package annotationCheck;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class WriterProcessor {
	public void writerProcessor(){
		Class clazz= Writer.class;
		
		try {
		
			Method method[]= clazz.getDeclaredMethods();
			
			for(int i=0;i<method.length;i++){
		//	if(method[i].isAnnotationPresent(PutData.class)||method[i].isAnnotationPresent(Greeting.class))
			
				Annotation annotation= method[i].getAnnotation(PutData.class);
				
				if(annotation instanceof PutData){
				
					PutData pd= (PutData)annotation;
					
					File file= new File(pd.path());
				
			FileWriter fileWriter;
			
			try {
				fileWriter = new FileWriter(file);
				fileWriter.write(pd.message());
				
				fileWriter.flush();
				fileWriter.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}
				Annotation annotation1= method[i].getAnnotation(Greeting.class);

				if(annotation1 instanceof Greeting){
					Greeting greet=(Greeting)annotation1;
					
					System.out.println("The count is:"+greet.count());
					System.out.println(greet.name());
				}
		
			}
		}
		catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
	
}
}