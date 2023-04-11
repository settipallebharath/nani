package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ExpC 
{
public static void main(String[] args) 
{
LinkedList <Integer> l=new LinkedList<Integer> ();
l.add(10);
l.add(5);
l.add(2);
l.add(30);
l.add(15);
System.out.println(l);
Iterator b=l.descendingIterator();
while(b.hasNext());
System.out.println(b.next());
	}
}
