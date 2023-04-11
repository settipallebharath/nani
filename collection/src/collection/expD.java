package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class expD
{
public static void main(String[] args) 
{
Set<Integer> s=new HashSet<Integer>();
s.add(5);
s.add(2);
s.add(10);
s.add(7);
Iterator h=s.iterator();
while(h.hasNext())
{
	System.out.println(h.next());
}
	}

}
