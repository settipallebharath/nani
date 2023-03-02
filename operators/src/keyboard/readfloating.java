package keyboard;

import java.io.DataInputStream;

public class readfloating
{
public static void main(String[] args)
{
	float b;
	DataInputStream r=new DataInputStream(System.in);
	try
	{
		System.out.println("enter floating values");
		b=Float.valueOf(r.readLine());
		System.out.println("b="+b);
	}
	catch (Exception e)
	{
	}
}
}
