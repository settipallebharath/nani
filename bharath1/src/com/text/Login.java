package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    String name=request.getParameter("user");
    String pass=request.getParameter("pwd");
    Cookie ck=new Cookie ("info",name);
    response.addCookie(ck);
    //HttpSession session=request.getSession();
    //session.setAttribute("info",name);
    out.println("From Servlet 1: "+name);
    out.println("<a href='servlet2'> Next Page</a>");
	}

}
