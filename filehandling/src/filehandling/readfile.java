package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class readfile 
{
public static void main(String[] args) throws Exception
{
FileInputStream cat=new FileInputStream("src/bharath.txt");
BufferedInputStream dog=new BufferedInputStream(cat);
byte [] br=new byte [1024];
int x=0;
while ((x=dog. read(br))!= -1)
{
	System.out.println(new String(br,0,x));
}
	}
}
