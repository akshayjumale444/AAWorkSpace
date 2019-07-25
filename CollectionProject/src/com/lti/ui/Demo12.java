package com.lti.ui;
import java.util.*;
import com.lti.bean.*;
public class Demo12 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<Long,Account> paytm=new HashMap<Long,Account>();
		paytm.put(new Long(1234569870L), new Account(100,"Ram",25000.00));
		paytm.put(9874566321L, new Account(101,"Sham",22000.00));
		paytm.put(4563217890L, new Account(102,"Krishna",35000.00));
		
		//get(key)
		//retrieving account of mobile key 1234569870
		Account ob=paytm.get(1234569870L);
		System.out.println(ob);
		System.out.println("------------------------------------");
	
		Set<Long>mobilekeys=paytm.keySet(); // to retrieve all mobile numbers
		
		Iterator <Long> it =mobilekeys.iterator();
		while(it.hasNext())
		{
			Long key=it.next();
			Account value=paytm.get(key);
			System.out.println(key+"===>"+value);
		}	
	}

}
