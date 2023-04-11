package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exp3
{
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pk","root","bharath@136");
	Statement stmt=con.createStatement();
	//String sql1="create table bk (id int,name varchar(60),city varchar(60))";
	//String sql2="insert into bk values (1,'balaji','blr'),(2,'bhavya','mpl')";
	//String sql3="update bk set name='ravi' where id=1";
	//String sql4="delete from bk where id=9";
   String sql="select *from mb";
   ResultSet rs=stmt.executeQuery(sql);
   while(rs.next()) 
   { 
	   System.out.println("ID:" +rs.getInt(1)+ "Name:" +rs.getString(2)+ "city:" +rs.getString(3)); 
   }
   System.out.println("done");
   }
}
