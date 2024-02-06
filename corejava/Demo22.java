package assignment;

public class Demo22 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds occur");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occur");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occur");
		}
		System.out.println("rest of the code");
	}
}
