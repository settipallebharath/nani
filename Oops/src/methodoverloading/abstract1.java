package methodoverloading;

public abstract class abstract1 
{
double dim1,dim2;
abstract1 (double a,double b)
{
	dim1=a;
	dim2=b;
}
abstract double area();
}
class pavan extends abstract1
{
	pavan (double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return dim1*dim2;
	}
	}
class jeevan extends abstract1
{
	jeevan(double a, double b)
	{
		super(a, b);
	}
	double area()
	{
		return dim1=dim2;
	}
}
class harshi
{
	public static void main(String[] args) 
	{
	pavan r=new pavan (9,5);
	jeevan p=new jeevan (10,8);
	System.out.println("area is"+r.area());
	System.out.println("area is="+p.area());
	}
}
