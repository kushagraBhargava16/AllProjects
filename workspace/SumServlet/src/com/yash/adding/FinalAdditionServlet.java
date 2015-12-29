package com.yash.adding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FinalAdditionServlet
 */
@WebServlet("/FinalAdditionServlet")
public class FinalAdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//Cookie cookie=new Cookie("check", "y");
		//cookie.setMaxAge();
		//response.addCookie(cookie);
		PrintWriter out = response.getWriter();
		
		Integer sum = (Integer) request.getAttribute("sum1");
		
		// int sum=Integer.parseInt(cache);
		
		HttpSession session = request.getSession(true);
		
		Integer counter = 1;
		
		session.setAttribute("aCounter", counter);
		
		session.setAttribute("num1", sum);
		
		response.setContentType("text/html");
		
		String heading = "Final Sum!";
		
		out.println("<html>");
		
		out.println("<head>");
		out.println("<h1>" + heading + "</h1>");
		out.println("</head>");
		
		out.println("<body>");
		
		out.println("<br>");

		out.println("Sum is:" + sum);

		out.println("<br>");
		out.println("<form method='get' action='AddServlet'>");

		out.println("N3: <input type='text' name='number3'>");
		out.println("<input type='submit' value='Add Again!'>");

		out.println("</form>");
		
		out.println("</body>");

		out.println("</html>");

	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
