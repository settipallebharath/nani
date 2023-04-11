package filehandling;

import java.io.FileWriter;

public class writetest
{
public static void main(String[] args) throws Exception
{
FileWriter mk=new FileWriter("src/mahesh.txt");
String msg="This is char stream file write operation";
mk.write(msg);
mk.flush();
System.out.println("done");
	}
}
