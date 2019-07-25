//Set(Hashset())

package com.lti.ui;
import java.util.*;

public class Demo10 
{

	public static void main(String[] args) 
	{
		//Set <String> col=new HashSet<String>(); 	//unordered sequence //no duplicates
		//in order to check duplicates, set will invoke elements equals() and hashcode() to match contents
		//if the element object has duplicate contents then it will not be added.
		List <String> col=new ArrayList<String>();
		
		col.add("Ram");
		col.add("Sham");
		col.add("Krishna");
		col.add("Ram");
		//col.add(100);		//new integer(100);		//auto boxing
		
		int size=col.size();
		System.out.println("No of elements "+size);
		
		System.out.println(col);
		System.out.println("--------------------------------------");
		
		col.remove("Sham");
		System.out.println(col);
		System.out.println("-------------------------------------");
		System.out.println("List Specific method");
		System.out.println("Object at 1 index");
		String s2=col.get(1);
		System.out.println(s2);
		System.out.println("------------------------------------");
		System.out.println("Replacing -----------------------");
		col.set(2, "Ganesha");
		System.out.println(col);
		
		col.add(2,"Durga");
		System.out.println("Adding Durga ---------------------------");
		System.out.println(col);
		
		col.remove(1);
		System.out.println("Removing ------------");
		System.out.println(col);
		
		/*Iterator<String> it=col.iterator();
		while(it.hasNext())		//find the element in the collection
		{
			String el=it.next();		//retrieve element and stores in String object 'el'
			System.out.println(el);
		}
		System.out.println("-----------------------------------------");
		
		for(String s:col)
		{
			System.out.println(s);
		}*/
	}

}
