package methodoverloading;

public class thisExp1
	{
	int a=10;int b=20;
	void add (int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String[]args)
	{
		thisExp1 s=new thisExp1();
		s.add(100, 200);
	}
}
