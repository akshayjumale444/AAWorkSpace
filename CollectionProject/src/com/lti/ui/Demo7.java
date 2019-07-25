//Set(Hashset())

package com.lti.ui;
import java.util.*;
import com.lti.bean.*;

public class Demo7 
{

	public static void main(String[] args) 
	{
		Set <Account> col=new HashSet<Account>(); //unordered sequence //no duplicates
		//in order to check duplicates, set will invoke elements equals() and hashcode() to match contents
		//
		col.add(new Account(100,"aa",5000.00));
		col.add(new Account(101,"aa",6000.00));
		col.add(new Account(102,"aa",8000.00));
		col.add(new Account(100,"aa",5000.00));
		//col.add(100);		//new integer(100);		//auto boxing
		
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);

	}

}
