package serialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class deserialdemo
{
public static void main(String[] args) throws Exception
{
FileInputStream kum=new FileInputStream("src/customer.txt");
ObjectInputStream set=new ObjectInputStream(kum);
customer obj=(customer)set.readObject();
System.out.println(obj.id+" "+obj.name+" "+obj.city+" "+obj.pin);
	}
}
