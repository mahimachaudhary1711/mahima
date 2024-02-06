package assignment;

public class Demo20 
{
	public static void main(String[] args) 
	{
		try
		{
			int numerator=10;
			int denominator=0;
			int result=numerator/denominator;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Exception: Division by zero is not allowed");
		}
		finally
		{
			System.out.println("This block always executes");
		}
		System.out.println("program continue executing.....");
	}
}
