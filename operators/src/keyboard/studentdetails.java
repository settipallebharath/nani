package keyboard;
import java.io.*;
public class studentdetails
{
public static void main(String[] args) throws IOException
{
BufferedReader r=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter student no");
int no=Integer.parseInt(r.readLine());
System.out.println("enter gender m/f");
char gender =(char)r.read();
System.out.println("enter student name");
String name= r.readLine();
System.out.println("student no="+no);
System.out.println("student gender="+gender);
System.out.println("student name="+name);
}
}
