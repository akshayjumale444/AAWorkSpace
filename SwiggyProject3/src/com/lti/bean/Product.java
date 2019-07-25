package com.lti.bean;

public class Product 
{
	private int pid;
	private String pname;
	private double price;
	
	//default constructor
	public Product() {
		// TODO Auto-generated constructor stub
		pid=1;
		pname="Food";
		price=1.0;
	}
	
	
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}



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
   