package inheritance;
class harshi
{
	int i,j;
	void pavan()
	{
		System.out.println(i+"------"+j);
	}
}
class bhavya extends harshi
{
int k;
void nani()
{
	System.out.println("k:"+k);
}
void sum()
{
	System.out.println("i+j+k:"+(i+j+k));
}
}
public class singleinhExp
{
	public static void main(String[] args) 
	{
		harshi t1=new harshi ();
		bhavya  t2=new bhavya ();
		t1.i=10;
		t1.j=20;
		t1.pavan();
		System.out.println();
		t2.i=7;
		t2.j=8;
		t2.k=9;
		System.out.println("contants");
		t2.pavan();
		t2.nani();
		System.out.println();
		System.out.println("sum:");
		t2.sum();
		}
		}
