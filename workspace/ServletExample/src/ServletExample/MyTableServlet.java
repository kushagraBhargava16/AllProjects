package ServletExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 * Servlet implementation class MyOddEvenServlet
 */
@WebServlet("/MyOddEvenServlet")
public class MyTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int num=5;
       protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   PrintWriter printWriter=response.getWriter();
		for(int i=1;i<=10;i++){
			printWriter.println(num+"x"+i+"="+num*i+"<br/>");
		}
		printWriter.close();

	}

}
