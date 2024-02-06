	/*
	1 
	01 
	101 
	01010 
	101010 
	*/
	
	package assignment;
	
	public class Demo9 
	{
		public static void main(String[] args) 
		{
			int k;
			for(int i=1; i<=5; i++)
			{
				k=i;
				for(int j=1; j<=i; j++)
				{
					System.out.print(k%2);
					k++;
				}
				System.out.println();
			}
		}
	}
