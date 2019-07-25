//Set(Hashset())

package com.lti.ui;
import java.util.*;

public class Demo3 
{

	public static void main(String[] args) 
	{
		Set col=new HashSet(); //unordered sequence //no duplicates
		col.add("Ram");
		col.add("Sham");
		col.add("Krishna");
		col.add("Ram");
		col.add(100);		//new integer(100);		//auto boxing
		
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);

	}

}
