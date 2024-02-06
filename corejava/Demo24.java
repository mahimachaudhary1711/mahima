package assignment;

class t1 extends Thread
{
	public void run()
	{
		System.out.println("thread is running");
	}
}
public class Demo24 
{
	public static void main(String[] args) 
	{
		t1 d1=new t1();
		d1.start();
	}
}
