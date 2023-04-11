package filehandling;
import java.io.File;
import java.io.FileOutputStream;
public class filewrite
{
	public static void main(String[] args) throws Exception
	{
File uma=new File("src/bharath.txt");
FileOutputStream som=new FileOutputStream(uma);
String msg= "Hi this is file write operation using byte stream";
som.write(msg.getBytes());
System.out.println("done");
	}
}
