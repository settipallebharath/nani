package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exp6
{
public static void main(String[] args) 
{
Map<String,Integer> b=new TreeMap<String,Integer>();
b.put("dell",200);
b.put("lenove",90);
b.put("asus",300);
b.put("sony",4000);
b.put("apple",8399);
b.put("dell",500);
System.out.println(b);
Iterator<Entry<String,Integer>> k=b.entrySet().iterator();
while(k.hasNext())
{
	Entry<String,Integer> s=k.next();
	System.out.println(s.getKey()+""+s.getValue());
}
for(String key:b.keySet())
{
	System.out.println(key+""+b.get(key));
}
}
}
