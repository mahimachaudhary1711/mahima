package assignment;

import java.util.Scanner;

public class Demo16 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int no=in.nextInt();
		int [] a=new int[no];
		for(int i=0; i<no; i++)
		{
			System.out.println("Enter a number:");
			a[i]=in.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0; i<no; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The maximum number is:"+max);
		System.out.println();
		System.out.println("The minimum number is:"+min);
	}
}
