// write a program to print values by passing arguments? //
package polymorphism;
public class exp2 
{
private int a,b;
public void display (int x,int y)
{
	a=x;
	b=y;
}
public void output()
{
	System.out.println("a="+a);
	System.out.println("b="+b);
}
	public static void main(String[] args) 
	{
	exp2 t=new exp2();
	t.display(10,20);
	t.output();
	}
}
