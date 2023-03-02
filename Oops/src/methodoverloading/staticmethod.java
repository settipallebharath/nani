package methodoverloading;

class bharath
{
static int x=10;
void display()
{
	x++;
	System.out.println("x="+x);
}
}
public class staticmethod
{
public static void main(String[] args) 

{
bharath s=new bharath ();
s.display();
bharath s1=new bharath ();
s1.display();
	}
}
