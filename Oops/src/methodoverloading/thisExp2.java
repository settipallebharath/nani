package methodoverloading;

public class thisExp2 
{
static int a;
int b;
void values (int a,int b)
{
	this.a=a;
	this.b=b;
}
void add()
{
	System.out.println(a+b);
}
void mul()
{
	System.out.println(a*b);
}
	public static void main(String[] args) 
	{
	thisExp2 x=new thisExp2();
	x.values(100,200);
	x.add();
	x.mul();
	}
}
