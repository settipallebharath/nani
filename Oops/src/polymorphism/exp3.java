package polymorphism;
public class exp3 
{
void m1 (char mk)
{
	System.out.println("mk="+mk);
}
void m1 (int i)
{
	System.out.println("i="+i);
}
void m1(int i,int j)
{
	System.out.println(i+"--------"+j);
}
	public static void main(String[] args) 
	{
	exp3 g=new exp3();
	g.m1('a');
	g.m1(10);
	g.m1(10,20);
	}
}
