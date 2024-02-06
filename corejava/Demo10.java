/*
	1 
   2 2 
  3 3 3 
 4 4 4 4 
*/
package assignment;

public class Demo10 
{
	public static void main(String[] args) 
	{
		int n=4,i,j,s,x;
		s=n+4-1;
		for(i=1; i<=n; i++)
		{
			for(x=s; x!=0; x--)
			{
				System.out.print(" ");
			}
			for(j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			s--;
		}
		
	}
}		
		
	

