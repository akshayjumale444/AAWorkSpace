// Object Type-Casting
package com.lti.ui;
import com.lti.bean.*;

public class Demo2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employee e=new Manager(101,"Raja",50000.00,"IT");
		System.out.println(e);
		
		Manager m= (Manager)e;
		m.setDepartment("HR");
		System.out.println(m); 
		
			
	}

}
