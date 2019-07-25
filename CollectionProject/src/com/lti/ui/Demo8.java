//Set(Hashset())

package com.lti.ui;
import java.util.*;

public class Demo8 
{

	public static void main(String[] args) 
	{
		//Set <String> col=new HashSet<String>(); //unordered sequence //no duplicates
		//Set <String> col=new LinkedHashSet<String>(); // Ordered Sequence // no duplicates // one null allowed 
		//in order to check duplicates, set will invoke elements equals() and hashcode() to match contents
		//if the element object has duplicate contents then it will not be added.
		Set <String> col=new TreeSet<String>();	//no null // Element in sorted order in natural order//
		col.add("Ram");
		col.add("Sham");
		col.add("Krishna");
		col.add("Ram");
		//col.add(null);
		
		//col.add(100);		//new integer(100);		//auto boxing
		
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);

	}

}
