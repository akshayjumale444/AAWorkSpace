//Set(Hashset())

package com.lti.ui;
import java.util.*;

public class Demo6 
{

	public static void main(String[] args) 
	{
		Set <String> col=new HashSet<String>(); //unordered sequence //no duplicates
		//in order to check duplicates, set will invoke elements equals() and hashcode() to match contents
		//if the element object has duplicate contents then it will not be added.
		col.add("Ram");
		col.add("Sham");
		col.add("Krishna");
		col.add("Ram");
		//col.add(100);		//new integer(100);		//auto boxing
		
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);

	}

}
