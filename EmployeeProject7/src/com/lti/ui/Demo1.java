package com.lti.ui;
import com.lti.bean.*;
public class Demo1 
{

	public static void displayDatawithBonus(Employee e)
	{
		System.out.println(e); // e.toString() will be executed automatically
		double bonus =0.0;
		if( e instanceof Manager)
			bonus=e.getSalary()*0.50;
		else if(e instanceof Engineer)
			bonus=e.getSalary()*0.3;
		else
			bonus=e.getSalary()*0.2;
		System.out.println("Bonus is "+ bonus);
	}
	
	public static void main(String[] args)
	{
		Employee emp=new Employee(100,"KING",24000.00);
		displayDatawithBonus(emp);
		
		Manager m=new Manager(101,"Raja",50000.00,"IT");
		displayDatawithBonus(m);
		
		Engineer en=new Engineer(102,"Amir Khan",25000.00,"Swiggy"); 
		displayDatawithBonus(en);
		
		
	}		
}
