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
import javax.xml.ws.Response;

/**
 * Servlet implementation class MyFactorialServlet
 */
@WebServlet("/MyFactorialServlet")
public class MyFactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int num=4,fact=1;     
@Override
public void service(ServletRequest request, ServletResponse response)
		throws ServletException, IOException {
PrintWriter printWriter=response.getWriter();

for(int i=num;i>0;i--){
	fact=fact*i;
}
printWriter.println("Factorial:"+fact);
printWriter.close();
}

}
