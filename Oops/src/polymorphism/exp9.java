package polymorphism;

public class exp9
{
	public void method (int x,float y)
	{
		System.out.println("method1");
		return;
	}
	public void method2 ()
	{
		System.out.println("method2");
	}
	public void method3 ()
	{
		System.out.println("method3");
	}
	public String method4 ()
	{
		System.out.println("method4");
		return "java";
	}
public static void main(String[] args) 
{
exp9 s=new exp9();
s.method(4,8.9f);
s.method2();
s.method3();
s.method4();
	}
}
