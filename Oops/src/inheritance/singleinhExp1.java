package inheritance;
class pavan
{
int id=11;
String name="java";
public void display()
{
System.out.println("display ()");
}
protected void show ()
{
	System.out.println("show ()");
}
public void dog ()
{
	System.out.println("dog ()");
}
}
class jeevan extends pavan
{
 void animal ()
{
	String city="madanapalle";
	String cnt="indian";
	System.out.println("animal ()"+id+""+name+""+city+""+cnt);
}
}
 public class singleinhExp1
 {
public static void main(String[] args) 
	{
	
	pavan b=new pavan ();
	jeevan d=new jeevan ();
	
	d.animal ();
	b.display();
	b.show();
	b.dog();
	}
}

