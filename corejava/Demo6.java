//W.A.J.P for create Fibonacci Series.

package assignment;

public class Demo6 
{
	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3,i,count=10;
		System.out.println(n1+" "+n2);
		for(i=2; i<count; ++i)
		{
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
		}
	}
}
