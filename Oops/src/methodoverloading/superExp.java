package methodoverloading;

public class superExp
{
int a=10,b=20;
}
class nani extends superExp
{
int a=10,b=30;
void add(int a,int b)
{
	System.out.println(a+b);
	System.out.println(this.a+this.b);
	System.out.println(super.a+super.b);
}
	public static void main(String[] args)
	{
	nani f=new nani();
	f.add(100,200);
	}
}
