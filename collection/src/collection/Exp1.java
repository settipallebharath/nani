package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exp1 
{
public static void main(String[] args) 
{
List<String> b=new ArrayList<String>();
b.add("sony");
b.add("zero");
b.add("dell");
b.add("apple");
b.add("lenovo");
b.add("hello");
b.add("asus");
b.add("sony");
b.add("dell");
//List<String>flt=b.parallelStream().sorted().collect(Collectors.toList());
//List<String>flt=b.parallelStream().distinct().collect(Collectors.toList());
//List<String>flt=b.parallelStream().filter(dt->dt.startsWith("a")).collect(Collectors.toList());
List<String>flt=b.parallelStream().filter(dt->dt.length()>4).collect(Collectors.toList());
flt.forEach(n->System.out.println(n));
	}
}
