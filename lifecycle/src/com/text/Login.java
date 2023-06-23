package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter go=response.getWriter();
		String Fname=request.getParameter("fname");
		String Lname=request.getParameter("lname");
		String pass=request.getParameter("pwd");
		if(Fname.equals("bharath")&&Lname.equals("kumar")&&pass.equals("123"))
		{
			go.println("login success");
		}
		else
		{
			go.println("login failed");
		}
	}

	}
