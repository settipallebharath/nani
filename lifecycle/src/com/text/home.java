package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/home")
public class home extends HttpServlet {
	      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter go=response.getWriter();
		String Sname=request.getParameter("Sname");
		String Srn=request.getParameter("Snum");
		String pass=request.getParameter("pwd");
		if(Sname.equals("bharath")&&Srn.equals("1")&&pass.equals("123"))
		{
			go.println("login success");
		}
		else
		{
			go.println("login failed");
		}
	}

}
