package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class expA 
{
public static void main(String[] args) 
{
List<String> k=new ArrayList<String>();
k.add("car");
k.add("bus");
k.add("car");
k.add("bus");
Collections.sort(k);
for(String m:k)
System.out.println(m);
List<Integer> k2=new ArrayList<Integer> ();
k2.add(5);
k2.add(9);
k2.add(3);
k2.add(10);
Collections.sort(k2);
for(Integer b:k2)
	System.out.println(b);
	}
}
