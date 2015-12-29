package com.yash.adding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		//Cookie[] cookies= request.getCookies();
		Integer counter = (Integer) session.getAttribute("aCounter");
		
		if (counter == null)
		//if(cookies==null)
		{
			int num1 = Integer.parseInt(request.getParameter("number1"));
			int num2 = Integer.parseInt(request.getParameter("number2"));
			// out.println(num1+num2);
			request.setAttribute("sum1", num1 + num2);
			/*Cookie cookie=new Cookie("n", "y");
			response.addCookie(cookie);*/
			request.getRequestDispatcher("/FinalAdditionServlet").forward(
					request, response);

		} else {
			Integer num1 = (Integer) session.getAttribute("num1");
			Integer num2 = Integer.parseInt(request.getParameter("number3"));
			Integer sum = num1 + num2;
			// out.print(sum);
			counter++;
			request.setAttribute("sum1", sum);
			/*for (Cookie cookie : cookies) {
				
				cookie.setMaxAge(0);
			}*/
			request.getRequestDispatcher("/FinalAdditionServlet").forward(
					request, response);

		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
