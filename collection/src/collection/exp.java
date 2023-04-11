package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class exp
{
public static void main(String[] args) 
{
List<String> h=new  ArrayList <String> ();
h.add("mango");
h.add("apple");
h.add("banana");
h.add("apple");
System.out.println(h);
Iterator b=h.iterator();
while (b.hasNext())
{
System.out.println(b.next());
}
}
}
