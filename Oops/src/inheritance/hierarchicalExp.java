package inheritance;
class animal 
{
void eat ()
{
	System.out.println("eating...");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("barking...");
	}
}
class cat extends animal
{
	void meow()
	{
		System.out.println("meowing...");
	}
}
public class hierarchicalExp
{
	public static void main(String[] args) 
	{
	cat h=new cat ();
	h.meow();
	h.eat();
	dog d=new dog();
	d.bark();
	}
}
