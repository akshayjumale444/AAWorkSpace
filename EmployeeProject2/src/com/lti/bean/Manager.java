package com.lti.bean;

public class Manager extends Employee
{
	private String department;
	
	public Manager() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public Manager(int eid,String ename,double salary,String department) 
	{
		// TODO Auto-generated constructor stub
		super(eid,ename,salary);			//call to the super class constructor
		//call to the super class constructor has to be the first line in subclass constructor
		this.department=department;
		
		//using 'super' keyword we can call super class variable or method or constructor
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
