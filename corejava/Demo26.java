package assignment;

import java.util.ArrayList;
import java.util.List;

public class Demo26 
{
	public static void main(String[] args) 
	{
		List<String> li=new ArrayList<String>();
		li.add("Black");
		li.add("Red");
		li.add("Green");
		li.add("Purple");
		System.out.println(li);
		li.set(2, "Pink");
		li.set(1, "White");
		System.out.println(li);
	}
}
