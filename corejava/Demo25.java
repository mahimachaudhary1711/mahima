package assignment;

import java.util.Arrays;
import java.util.List;

public class Demo25 
{
	public static void main(String[] args) 
	{
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8);
		for(int i=0; i<=num.size(); i++)
		{
			System.out.print(num.get(i) + " ");
		}
	}
}
