package com.lti.ui;
import com.lti.bean.*;

public class Demo
{	
	//pass by value
	public static void changeValue(int x)
	{
		x= x*2;
		}
		
	//Pass by Reference
	public static void changeObject(Product pr)
	{
		pr.setPid(200);
		pr.setPname("Dosa");
		pr.setPrice(500.32);
	}
	
	public static void main(String[] args)
	{
	int a=100;
	System.out.println(a);
	changeValue(a);
	System.out.println(a);
	
	Product ob2=new Product(101,"VadaPav",20.32);
	String res1=ob2.display();
	System.out.println(res1);
	System.out.println("====================");
	changeObject(ob2);
	res1=ob2.display();
	System.out.println(res1);
	
		
	}

}
