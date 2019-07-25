package com.lti.ui;
import com.lti.bean.*;

public class Demo
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Product ob1=new Product();
		//ob1.acceptValues(100, "Burger", 150.00);
		ob1.setPid(100);
		ob1.setPname("BURGER");
		ob1.setPrice(150.80);
		String temp=ob1.display();
		System.out.println(temp);
		System.out.println();
		
		Product ob2=new Product();
		//ob2.acceptValues(100, "Pizza", 150.00);
		ob2.setPid(101);
		ob2.setPname("PIZZA");
		ob2.setPrice(50.89);
		temp=ob2.display();
		System.out.println(temp);
		System.out.println("==============================");
		ob2.setPrice(350);
		double curr=ob2.getPrice();
		System.out.println("Changed price is :-->"+curr);
		
		
		
	}

}
