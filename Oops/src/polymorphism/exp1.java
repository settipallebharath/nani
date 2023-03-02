//write a program instance methods taking arguments? //
package polymorphism;
public class exp1 
{
void m1(int i,char j)
{
	System.out.println(i+"-----"+j);
}
void m2(float a,String sbk)
{
	System.out.println(a+"-----"+sbk);
}
public static void main(String[] args) 
{
exp1 b=new exp1();
b.m1(10,'h');
b.m2(10.5f, "bharath");
	}
}
