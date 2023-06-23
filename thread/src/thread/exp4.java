package thread;
class Item
{
	int value;
	boolean valset=false;
	public synchronized void putItem (int i)
	{
		try
		{
			if(valset)
			{
		wait();
	}
	value=i;
	System.out.println("producer produced item -> "+value);
	valset=true;
	notify();
}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	public synchronized void getItem()
	{
		try
		{
			if(!valset)
			{
				wait();
			}
			System.out.println(" -> consumer consumed item _> "+value);
		valset=false;
		notify();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

class producer extends Thread
{
int i;
Item item;
public producer (Item item)
{
	this.item=item;
}
public void run()
{
	try
	{
		while(true)
		{
			Thread.sleep(1000);
item.putItem(i++);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
class consumer extends Thread
{
Item item;
public consumer (Item item)
{
	this.item=item;
}
public void run()
{
	try
	{
		while(true)
		{
Thread.sleep(500);
item.getItem();
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
public class exp4
{
public static void main(String[] args) 
{
Item item =new Item ();
producer pr=new producer(item);
consumer cr=new consumer(item);
pr.start();
cr.start();
	}
}
