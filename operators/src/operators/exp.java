package operators;
public class exp 
{
	private 
	int a,b,sum,sub,mul;
	public void accept()
	{
		a=10;
		b=20;
	}
	public void process()
	{
		sum=a+b;
		sub=a-b;
		mul=a*b;
	}
	public void display()
	{
		System.out.println("sum="+sum);
		System.out.println("sub="+sub);
		System.out.println("mul="+mul);
	}
public static void main(String[] args)
{
exp a=new exp();
a.accept();
a.process();
a.display();
	}
}