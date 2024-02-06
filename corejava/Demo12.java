//WAP to compute the sum of the first 100 prime numbers. 

package assignment;

public class Demo12 
{
	public static void main(String[] args) 
	{
		int count,sum=0;
		for(int no=1; no<=100; no++)
		{
			count=0;
			for(int i=2; i<=no/2; i++)
			{
				if(no%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && no!=1)
			{
				sum=sum+no;
			}
		}
		System.out.println("Sum of prime number of 100 is:" + sum);
	}
}