package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exp2")
public class exp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   	{
   		PrintWriter out=response.getWriter();
		ServletContext ctx=getServletContext();
		String data=(String) ctx.getAttribute("info");
		out.println("exp2:+data");
		out.println("<a href='exp1'>Exp1 page</a>");
   	}

}
