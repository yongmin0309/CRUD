package com.edu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.catalina.connector.Request;
@WebFilter(filterName="flow", urlPatterns="/*")
public class FlowFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		System.out.println("init() 호출 " );
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
	ServletException{
		request.setCharacterEncoding("UTF-8");
		System.out.println("doFilter()호출 전");
		chain.doFilter(request, response);
		System.out.println("doFilter() 호출 후");
	}
	
	public void destrioy() {
		System.out.println("destroy() 호출");
	}
}
