package collection;

import java.util.LinkedList;

public class expB
{
public static void main(String[] args) 
{
LinkedList<String> l=new LinkedList<String>();
l.add("bhanu");
l.add("bhavya");
l.add("balaji");
l.add("bavana");
System.out.println(l);
l.remove("bhanu");
System.out.println(l);
l.remove(0);
System.out.println(l);
}
}