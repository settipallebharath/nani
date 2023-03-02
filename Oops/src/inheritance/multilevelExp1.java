package inheritance;
class bharath
{
	int no=100;
	String name="indian";
	void bharath()
	{
		System.out.println("bharath employee");
	}
}
class nani extends bharath
{
	void nani()
	{
		System.out.println("no="+no);
		System.out.println("name="+name);
	}
}

public class multilevelExp1 extends nani
{
	int no=200;
	String name="prashanth";
	void display()
	{
		System.out.println("no="+no);
		System.out.println("name="+name);
	}
public static void main(String[] args) 
{
nani p=new nani();
p.bharath();
p.nani();
multilevelExp1 j=new multilevelExp1();
j.display();
	}
}
