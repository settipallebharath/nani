package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exp8
{
public static void main(String[] args) 
{
Map<Bharath,Integer> n=new HashMap<Bharath,Integer>();
/*n.put(new Bharath (1,"king","Blur"),234);
 n.put("lenovo",474);
 n.put("asus",123);
 n.put("dell",256);
 n.put("sony",567);
 n.put("apple",456);
 n.put("mac",647);
 System.out.println(n);
 */
LinkedHashMap<String,Integer> s=new LinkedHashMap<>();
s.put("sony",234);
s.put("lenovo",474);
s.put("asus",123);
s.put("dell",256);
s.put("sony",567);
s.put("apple",456);
s.put("mac",647);
System.out.println(s);
Iterator<Entry<String,Integer>> itr=s.entrySet().iterator();
while(itr.hasNext())
{
	Entry<String,Integer> et=itr.next();
System.out.println(et.getKey()+""+et.getValue());
}
for(String ky:s.keySet())
{
	System.out.println("key:"+ky+"value:"+s.get(ky));
}
for(Integer val:s.values())
{
	System.out.println(val);
}
}
}