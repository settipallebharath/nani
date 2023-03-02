package methodoverloading;

public class constructor 
{
constructor ()
{
	System.out.println(" employee bharath");
}
constructor (int i)
{
	System.out.println("i="+i);
}
constructor (char a,int i)
{
	System.out.println(a+"-----"+i);
}
	public static void main(String[] args) 
	{
	constructor z1=new constructor ();
	constructor z2=new constructor (10);
	constructor z3=new constructor ('a',100);
	}

}
