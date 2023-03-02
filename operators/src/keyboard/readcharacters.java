package keyboard;
import java.io.DataInputStream;
public class readcharacters 
{
public static void main(String[] args)
{
char f;
DataInputStream r=new DataInputStream(System.in);
try
{
	System.out.println("enter a----d");
	f=(char)System.in.read();
	switch(f)
	{
	case'a':
	System.out.println("apple");
	break;
	case'b':
		System.out.println("ball");
		break;
	case'c':
		System.out.println("cat");
		break;
	case'd':
		System.out.println("dog");
		break;
		default:
			System.out.println("no matching");
	}
}
catch (Exception e)
{
	}
}
}
