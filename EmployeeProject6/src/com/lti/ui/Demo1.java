package com.lti.ui;
import com.lti.bean.*;
public class Demo1 {

	public static void main(String[] args)
	{
		String empdata="";
		
		Employee emp=new Employee(100,"KING",24000.00);
		empdata=emp.toString();
		System.out.println(empdata);
		
		emp=new Manager(101,"Raja",50000.00,"IT");
		empdata=emp.toString();
		System.out.println(empdata);
		
		emp=new Engineer(102,"Amir Khan",25000.00,"Swiggy"); 
		empdata=emp.toString();
		System.out.println(empdata);
		
	}		
}
