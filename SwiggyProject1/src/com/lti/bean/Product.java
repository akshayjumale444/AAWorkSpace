package com.lti.bean;

public class Product 
{
	private int pid;
	private String pname;
	private double price;
	
	public void acceptValues(int pid,String pname,double price)
	{
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	
	public String display()
	{
		String s="Product ID:"+pid+"\n"+"Product Name:"+pname+"\n Product Price:"+price;   
		return s;
	}
	
}
   