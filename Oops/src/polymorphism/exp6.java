package polymorphism;

class bike
{
void run ()
{
	System.out.println("running");
}
}
public class exp6 extends bike
{
void run ()
{
	System.out.println("running safely with 60km");
}
	public static void main(String[] args) 
	{
   bike t=new bike();
   t.run();
   exp6 s=new exp6();
   s.run();
	}
	}
