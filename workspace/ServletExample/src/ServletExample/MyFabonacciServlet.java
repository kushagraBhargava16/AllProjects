package ServletExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyNewServlet")
public class MyFabonacciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int upto=10,a=0,b=1; 
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter=response.getWriter();
		printWriter.print("Hello World<br/>");
		printWriter.println(a+","+b);
		
		for(int i=2;i<upto;i++){
			
			int c=a+b;
			
			printWriter.println(","+c);
			a=b;
			b=c;
			
		}printWriter.close();

	}

}
