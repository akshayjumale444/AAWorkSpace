package lti;

public class Test 
{
	public void add(String a,String b)
	{
		System.out.println(a+b);
	}
	
	//overload by number of parameter
	//apply variable arguments
	public void add(int...a)
	{
		int sum=0;
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println(sum);
	}
	/*public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void add(int a[])
	{
		int sum=0;
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println("Sum is "+sum);
	}*/

}
