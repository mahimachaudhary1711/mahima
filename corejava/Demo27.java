package assignment;

import java.util.ArrayList;
import java.util.List;

public class Demo27 
{
	public static void main(String[] args) 
	{
		List<String> li=new ArrayList<String>();
		li.add("Red");
		li.add("Purple");
		li.add("Black");
		li.add("White");
		System.out.println(li);
		li.remove(2);
		System.out.println("After receiving the elements: "+li);
	}
}
