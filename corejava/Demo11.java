package assignment;

public class Demo11 
{
	public static void main(String[] args) 
	{
		int i,j,n=3;
		for(i=0; i<n; i++)
		{
			for(j=0; j<=n-i-1; j++)
			{
				System.out.print(" ");
			}
			for(j=0; j<2*i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1; i<=n-1; i++)
		{
			for(j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(j=(n-i)*2-1; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
