package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class readtest 
{
public static void main(String[] args) throws Exception
{
FileReader bk=new FileReader("src/mahesh.txt");
BufferedReader ns=new BufferedReader(bk);
System.out.println(ns.readLine()+"\n");
	}
}
