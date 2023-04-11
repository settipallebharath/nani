package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exp7
{
public static void main(String[] args) 
{
Map<String,Integer> a=new HashMap<>();
a.put("lenovo",234);
a.put("sony", 435);
a.put("apple", 333);
a.put("asus", 223);
a.put("dell", 345);
a.put("sony", 456);
a.put("mac", 234);
System.out.println(a);
Map<String,Integer> a1=new LinkedHashMap<>();
a1.put("lenovo",234);
a1.put("sony", 435);
a1.put("apple", 333);
a1.put("asus", 223);
a1.put("dell", 345);
a1.put("sony", 456);
a1.put("mac", 234);
System.out.println(a1);
Iterator<Entry<String,Integer>> itr=a.entrySet().iterator();
while(itr.hasNext()) 
{
Entry<String,Integer> s=itr.next();
System.out.println(s.getKey()+""+s.getValue());
}
System.out.println(a.get("mac"));
for(String k:a.keySet())
{
	System.out.println(k+""+a.get(k));
}
for(Integer vl:a.values())
{
	System.out.println(vl);
}
}
}
