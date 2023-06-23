package com.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class register extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter enter=response.getWriter();
		String Fname=request.getParameter("fname");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pwd");
		if(Fname.equals("bharath")&&uname.equals("@java")&&pass.equals("123"))
		{
			enter.println("login success");
		}
		else
		{
			enter.println("login failed");
		}
	}

	}
