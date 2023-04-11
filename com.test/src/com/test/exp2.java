package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class exp2
{
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pk","root","bharath@136");
   /*PreparedStatement pst=con.prepareStatement("insert into mb values(?,?,?)");
   pst.setInt(1,115);
   pst.setString(2, "dose");
   pst.setString(3,"trt");
   pst.execute(); 
   
   PreparedStatement pst2=con.prepareStatement("update mb set name=? where id=?");
   pst2.setString(1, "king");
   pst2.setInt(2,115);
   pst2.execute(); 
   
   PreparedStatement pst3=con.prepareStatement("delete from mb where id=?");
   pst3.setInt(1,115);
   pst3.execute();
   */
   PreparedStatement pst1=con.prepareStatement("select *from mb"); 
   ResultSet rs=pst1.executeQuery();
   while(rs.next())
   {
	   System.out.println("ID : "+rs.getInt(1)+" Name: "+rs.getString(2)+" city: "+rs.getString(3));
   }
   System.out.println("done");
	}
}
