package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    String user=request.getParameter("user");
    HttpSession session=request.getSession();
    session.setAttribute("info",user);
    ServletContext ctx=getServletContext();
    int total=(int)ctx.getAttribute("total");
    int current=(int)ctx.getAttribute("current");
    out.println("current users:"+user);
    out.println("<br><br>total user:"+total);
    out.println("<br><br>current user:"+current);
    out.println("<a href='servlet2'>log out here</a>");
	}
}
