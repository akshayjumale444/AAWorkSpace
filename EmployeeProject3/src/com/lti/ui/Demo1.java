package com.lti.ui;
import com.lti.bean.*;

public class Demo1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Generating super class object
		Employee emp=new Employee(100,"KING",24000.00);
		
		//Generating sub-class object
		Manager mgr=new Manager(101,"Raja",50000.00,"IT"); ///Manager is calling own class override method toString()
		Engineer en=new Engineer(102,"Amir Khan",25000.00,"Swiggy"); ///Engineer is calling own class override method toString()
		
		String empdata=emp.toString();
		System.out.println(empdata);
		
		String mgrdata=mgr.toString();
		System.out.println(mgrdata);
		
		String engdata=en.toString();
		System.out.println(engdata);	
	}

}
