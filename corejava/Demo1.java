//W.A.J.P to Take three numbers from the user and print the greatest number.

package assignment;

	import java.util.Scanner;
	public class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first nuumber");
		int n1=in.nextInt();
		System.out.println("Enter the Second nuumber");
		int n2=in.nextInt();
		System.out.println("Enter the Third nuumber");
		int n3=in.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("N1 is greatest"+n1);
		}
		else if(n2>n3)
		{
			System.out.println("N2 is greatest"+n2);
		}
		else
		{
			System.out.println("N3 is greatest"+n3);
		}
	}
}

