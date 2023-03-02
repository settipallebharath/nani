package polymorphism;

class shape
{
	void draw ()
	{
		System.out.println("drawing...");
	}
	}
class rectangle extends shape
{
void draw()
{
	System.out.println("drawing rectangle...");
}
}
class circle extends shape
{
void draw()
{
	System.out.println("drawing circle....");
}
}
class triangle  extends shape
{
	void draw()
	{
		System.out.println("drawing triangle...");
	}

}
public class exp7
{
public static void main(String[] args) 
{
shape e;
e=new rectangle();
e.draw();
e=new circle ();
e.draw();
e=new triangle();
e.draw();
e=new shape();
e.draw();
	}
}

