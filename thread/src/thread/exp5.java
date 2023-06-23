package thread;
public class exp5 extends Thread
{
@Override
public void run ()
{
	try
	{
		Thread.sleep(1000);
		System.out.println("i am from run ()");
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
	public static void main(String[] args) throws Exception
	{
		Thread t1=new exp5();
		System.out.println("before starting thread state: "+t1.getState());
		System.out.println("before starting thread status: "+t1.isAlive());
		t1.start();
		System.out.println("after starting thread state: "+t1.getState());
		System.out.println("after starting thread status: "+t1.isAlive());
		Thread.sleep(200);
		System.out.println("in sleep thread state: "+t1.getState());
		System.out.println("in sleep thread status: "+t1.isAlive());
		t1.join();
		System.out.println("after joining thread state: "+t1.getState());
		System.out.println("after joining thread status: "+t1.isAlive());
	}
}