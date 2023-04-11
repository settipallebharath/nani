package collection;

import java.util.Set;
import java.util.TreeSet;

public class Exp4
{
public static void main(String[] args) 
{
Set<String> b=new TreeSet<String>();
b.add("java");
b.add("education");
b.add("hello");
b.add("java");
b.add("spring");
b.add("plm");
System.out.println(b);
Set<Integer> b1=new TreeSet<Integer>();
b1.add(11);
b1.add(2);
b1.add(22);
b1.add(20);
b1.add(11);
b1.add(3);
b1.add(7);
System.out.println(b1);
}
}