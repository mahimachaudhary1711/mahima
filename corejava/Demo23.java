package assignment;

class Demo implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Thread is running");
	}
}
public class Demo23 
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		Thread t1=new Thread(d1);
		t1.start();
	}
}
