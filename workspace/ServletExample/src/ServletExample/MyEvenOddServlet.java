package ServletExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyEvenOddServlet
 */
@WebServlet("/MyEvenOddServlet")
public class MyEvenOddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	int count=100; 
	
@Override
public void service(ServletRequest request, ServletResponse response)
		throws ServletException, IOException {
	PrintWriter printWriter=response.getWriter();
	printWriter.print("Even numbers:<br/>");
	for(int  i=0;i<=100;i++){
		if((i%2)==0){
			printWriter.print(i+"<br/><br/>");
		}
		}
	printWriter.print("1 is neither even nor odd.<br/><br/>");
	printWriter.print("Odd numbers:-<br/>");
	for(int i=3;i<=100;i++){
		if((i%2)!=0){
			printWriter.print(i+".<br/>");
		}
	}
}

}
