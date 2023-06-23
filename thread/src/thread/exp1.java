package thread;
public class exp1 extends Thread
{
public void run()
{
	System.out.println("I AM FROM RUN METHOD");
}
	public static void main(String[] args) 
	{
exp1 p1=new exp1();
exp1 p2=new exp1();
exp1 p3=new exp1();
System.out.println("Default thread name: "+p1.getName());
System.out.println("Default thread name: "+p2.getName());
System.out.println("Default thread name: "+p3.getName());
p1.setName("open AC");
p2.setName("withdraw");
p3.setName("statments");
System.out.println("thread name: "+p1.getName());
System.out.println("thread name: "+p2.getName());
System.out.println("thread name: "+p3.getName());
System.out.println("default thread priority: "+p1.getPriority());
System.out.println("default thread priority: "+p2.getPriority());
System.out.println("default thread priority: "+p3.getPriority());
System.out.println(MAX_PRIORITY);
System.out.println(NORM_PRIORITY);
System.out.println(MIN_PRIORITY);
p1.setPriority(MAX_PRIORITY);
p2.setPriority(NORM_PRIORITY);
p3.setPriority(MIN_PRIORITY);
System.out.println("thread priority: "+p1.getPriority());
System.out.println("thread priority: "+p2.getPriority());
System.out.println("thread priority: "+p3.getPriority());
	}
}