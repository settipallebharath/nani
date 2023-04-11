package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Bharath implements Comparable<Bharath>
{
	private int id;
	private String name;
	private int age;
	public Bharath (int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
		@Override
		public int compareTo(Bharath o)
		{
	return this.id-o.id;		
		}
	}
class nani implements Comparator<Bharath>
{
	@Override
	public int compare(Bharath o1,Bharath o2)
	{
		return o2.getName().compareTo(o1.getName());
	}
}
public class Exp2 
{
public static void main(String[] args) 
{
	List<Bharath> b=new ArrayList<Bharath>();
	b.add(new Bharath(11,"dell",12));
	b.add(new Bharath(6,"sony",3));
	b.add(new Bharath(4,"lenovo",5));
	b.add(new Bharath(5,"hello",16));
	b.add(new Bharath(3,"user",17));
	Collections.sort(b, new nani ());
	for(Bharath e:b)
	{
		System.out.println(e.getId()+" "+e.getName()+" "+e.getAge());
	}
	}
}
