package com.lti.bean;

public class Product 
{
	private int pid;
	private String pname;
	private double price;
	
	
	public int getPid()
	{
		return pid;
	}


	public void setPid(int pid)
	{
		this.pid = pid;
	}


	public String getPname() 
	{
		return pname;
	}


	public void setPname(String pname) 
	{
		this.pname = pname;
	}


	public double getPrice()
	{
		return price;
	}


	public void setPrice(double price) 
	{
		this.price = price;
	}


	public String display()
	{
		String s="Product ID:"+pid+"\n"+"Product Name:"+pname+"\n Product Price:"+price;   
		return s;
	}
	
}
   