package com.yash.enquirymanagment.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.yash.enquirymanagment.domain.User;

/**
 * Servlet Filter implementation class RequestFilter
 */
@WebFilter(urlPatterns="/*")
public class RequestFilter implements Filter {

    public RequestFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		String url=((HttpServletRequest)request).getRequestURL().toString();
		int dotIndex=url.lastIndexOf(".");
/*User user=new User();
try {
	User user2=(User) user.clone();
} catch (CloneNotSupportedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/
		
		if(dotIndex==-1){
		out.print("Invalid request!");	
		}
		else{
			
			String subUrl=url.substring(dotIndex);
		
			if(subUrl.equalsIgnoreCase(".do")||subUrl.equalsIgnoreCase(".jsp")){
				chain.doFilter(request, response);
			}
			else{
				
				out.print("Invalid request!");
			}
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
