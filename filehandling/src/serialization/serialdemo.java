package serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class serialdemo
{
public static void main(String[] args) throws Exception
{
FileOutputStream bh=new FileOutputStream("src/customer.txt");
ObjectOutputStream os=new ObjectOutputStream(bh);
customer cc=new customer();
cc.id=11;
cc.name="hero";
cc.city="mpl";
cc.pin=517;
os.writeObject(cc);
System.out.println("done");
	}
}
