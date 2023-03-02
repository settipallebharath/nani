package methodoverloading;

public class staticmethodA
{
static int atmpin=1234;
static int pincode=517325;
public static void display()
{
	System.out.println(pincode);
	staticmethodA mk=new staticmethodA();
	System.out.println(mk.atmpin);
}
public void show()
{
	System.out.println(atmpin);
	System.out.println(staticmethodA.pincode);
}
	public static void main(String[] args) 
	{
	staticmethodA t=new staticmethodA();
	t.display();
	t.show();
	}
}
