package com.text;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/myfilter")
public class myfilter implements Filter 
{
	public void destroy()
	{
		System.out.println("destroy");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		System.out.println("before servlet");
		chain.doFilter(request, response);
		System.out.println("after servlet");
	}
	public void init(FilterConfig fConfig) throws ServletException 
	{
	System.out.println("init()");
	}
}