package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exp3 
{
public static void main(String[] args) 
{
Set h=new HashSet();
h.add("hello");
h.add(20);
h.add("java");
h.add('A');
h.add(3.8f);
h.add(39.33);
h.add(false);
h.add("java");
boolean b=h.add(20);
System.out.println(b);
System.out.println(h);
LinkedHashSet h1=new LinkedHashSet();
h1.add("hello");
h1.add(20);
h1.add("java");
h1.add('A');
h1.add(3.8f);
h1.add(39.33);
h1.add(false);
h1.add("java");
h1.add(20);
System.out.println(h1);
Iterator itr=h1.iterator();
while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	}
}
