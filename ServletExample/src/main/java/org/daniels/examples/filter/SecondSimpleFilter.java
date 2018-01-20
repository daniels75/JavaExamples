package org.daniels.examples.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName = "secondSimpleFilter", urlPatterns = "/*")
public class SecondSimpleFilter implements Filter{

	
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		
		System.out.println(">>> start SecondSimpleFilter");
	
		chain.doFilter(httpRequest, httpResponse);
		
		System.out.println(">>> end SecondSimpleFilter");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
