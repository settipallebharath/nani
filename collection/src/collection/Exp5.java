package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Exp5 
{
public static void main(String[] args) 
{
TreeSet<Integer> s=new TreeSet<>();
s.add(15);
s.add(4);
s.add(9);
s.add(5);
s.add(3);
s.add(2);
s.add(13);
s.add(11);
System.out.println(s);
TreeSet<String> z=new TreeSet<String>();
z.add("lenovo");
z.add("dell");
z.add("sony");
z.add("asus");
z.add("apple");
z.add("imac");
System.out.println(z);
Iterator<Integer>itrlterator = s.descendingIterator();
	}
}
