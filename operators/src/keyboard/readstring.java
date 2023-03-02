package keyboard;
import java.io.DataInputStream;
public class readstring
{
public static void main(String[] args)
{
	String a;
	DataInputStream r=new DataInputStream (System.in);
	try
	{
		System.out.println("enter any string");
		a=r.readLine();
	System.out.println("a="+a);	
	}
catch (Exception e)
	{
	}
}
}
