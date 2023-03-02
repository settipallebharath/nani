package keyboard;

import java.io.DataInputStream;

public class readinteger
{
public static void main(String[] args)
{
int a,b,sum;
DataInputStream r=new DataInputStream(System.in);
try
{
	System.out.println("enter a value");
	a=Integer.parseInt(r.readLine());
	System.out.println("enter b value");
	b=Integer.parseInt(r.readLine());
	sum=a+b;
	System.out.println("sum="+sum);
}
catch (Exception e)
{
}
}
	}
