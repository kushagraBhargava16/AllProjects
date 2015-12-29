package com.yash.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class UsernameFilter
 */
@WebFilter(urlPatterns={"/Display.do"})
public class UsernameFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UsernameFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String username=(String)request.getAttribute("username");
		String password=(String)request.getAttribute("password");
		if("kush".equalsIgnoreCase(username)&&"123".equalsIgnoreCase(password)){
			out.print("<h1>Welcome User!</h1>");
		}else{
			out.print("<h1>Invalid User!</h1>");
			
		}
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
