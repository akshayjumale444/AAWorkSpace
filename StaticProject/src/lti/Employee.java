package lti;

public class Employee 
{
	int eid;
	String ename;
	static int count=10;
	
	//static block
	static
	{
		System.out.println("Static Block A "+count);
	}
	
	static
	{
		count=25;
		System.out.println("Static Block B "+count);
	}
	
public Employee(String ename)
{
	// TODO Auto-generated constructor stub
	this.ename=ename;
	eid=(int)(Math.random()*1000);
	count++;
	}
public static void showCount()
{
	System.out.println("Count is "+count);
	//System.out.println(eid);		//ststic method 
}

public void display()

{
	System.out.println("Employee is "+eid+" Name "+ename);
}

static
{
	count=30;
	System.out.println("Static Block C "+count);
}

}
