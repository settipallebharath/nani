package collection;

import java.util.ArrayList;
import java.util.List;

public class exp0 
{
public static void main(String[] args) 
{
List<String> c=new ArrayList<String>();
c.add("harshi");
c.add("10");
c.add("bhavaya");
c.add("null");
c.add("harshi");
System.out.println(c);
c.remove(1);
System.out.println(c);
c.add(2,"bharath");
System.out.println(c);
	}
}
