package handling;
public class Exp2 
{
public static void main(String[] args) 
{
try
{
	System.out.println(10/5);
}
catch (Exception e)
{
	//by using get message ();
	System.out.println(e.getMessage());
	//by printing exception class object
	System.out.println(e);
	//using printStackTrace () method
	e.printStackTrace();
}
}
}
