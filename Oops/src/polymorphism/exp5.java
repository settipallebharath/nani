package polymorphism;
class bharath
{
int x=10;
void display ()
{
	x++;
	System.out.println("x="+x);
}
}
public class exp5
{
	public static void main(String[] args) 
	{
	bharath y=new bharath();
	y.display();
	bharath z=new bharath();
	z.display();
	}
}

