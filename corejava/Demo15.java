package assignment;

public class Demo15 
{
	public static int findIndex(int[] array, int element) 
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==element)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] array= {1,2,3,4,5};
		int element=3;
		int index=findIndex(array,element);
		System.out.println("Index of element"+element+":"+index);
	}
		
}
	
