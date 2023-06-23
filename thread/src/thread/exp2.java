package thread;

public class exp2 implements Runnable
{
@Override
public void run()
{
	System.out.println("i am from run(): "+Thread.currentThread().getName());
}
	public static void main(String[] args) 
	{
		exp2 t1=new exp2();
		//t1.start();
		ThreadGroup tg1=new ThreadGroup("Bank");
		Thread z2=new Thread (tg1,t1,"pen AC");
		Thread z3=new Thread (tg1,t1,"withdraw");
		Thread z4=new Thread (tg1,t1,"statements");
		ThreadGroup tg2=new ThreadGroup("Maths");
		Thread z5=new Thread (tg2,t1,"ADD");
		Thread z6=new Thread (tg2,t1,"SUB");
		Thread z7=new Thread (tg2,t1,"DIV");
		z4. start();
		z6.start();
		System.out.println("Thread group 1: "+tg1.activeCount());
		System.out.println("Thread group 2: "+tg2.activeCount());
		System.out.println(tg1);
	}
}
