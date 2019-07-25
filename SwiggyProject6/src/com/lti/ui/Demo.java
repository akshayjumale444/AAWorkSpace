package com.lti.ui;
import com.lti.bean.*;

public class Demo
{
	public static void main(String[] args)
	{
		// accept product values using Scanner class
		Product ob1=new Product(200,"dosa",20);
		//accept orderid and quantity using Scanner
		
		Order order=new Order(1111,ob1,32);
		order.showOrder();
		
	}

}
