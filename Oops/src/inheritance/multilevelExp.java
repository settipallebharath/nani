package inheritance;
class student
{
int no;
public void getstudent (int a) 
{
	no=a;
}
public void putdata ()
{
	System.out.println("no="+no);
	}
}
class test extends student
{
int m1,m2;
public void accept (int x,int y)
{
	m1=x;
	m2=y;
}
public void display()
{
	System.out.println(m1+"-----"+m2);
}
}
class result extends test
{
int total;
public void putresult()
{
	total=m1+m2;
	System.out.println("total="+total);
}
}
public class multilevelExp
{
		public static void main(String[] args)
		{
		result a=new result ();
		a.getstudent(100);
	a.putdata();
	a.accept(5, 6);
	a.display();
	a.putresult();
		}
	}

