package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exp1
{
public static void main(String[] args) throws Exception 
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pk","root","bharath@136");
Statement stmt=con.createStatement();
String sql="create table mb (id int,name varchar(60),city varchar(60))";
String sql1="insert into mb values (1,'balaji','blr'),(2,'bhavya','mpl')";
String sql2="update mb set name='ravi' where id=1";
String sql3="delete from mb where id=9";
stmt.execute(sql2);
con.close();
System.out.println("done");
}
}
