//WAP to calculate the average value of array elements.

package assignment;

public class Demo14 
{
	public static void main(String[] args) 
	{
		int[] no=new int[]{20,-30,40,50,-60,70};
		int sum=0;
		for(int i=0; i<no.length; i++)
		{
			sum=sum+no[i];
		}
		double avg=sum/no.length;
		System.out.println("average value of an elements is:"+avg);
	}
}
