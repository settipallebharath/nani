package polymorphism;

public class exp8 
{
public void add (int d)
{
	System.out.println("single arguments");
}
public void add (double x,float f)
{
	System.out.println("double arguments");
}
public void add (Float y)
{
	System.out.println("type of the arguments");
}
	public static void main (String[] args)
	{
		exp8 t=new exp8();
		t.add(20);
		t.add(10, 3.4f);
		t.add((int) 2.5);
		t.add(23.45f);	
	}
}
