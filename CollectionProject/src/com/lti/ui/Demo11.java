package com.lti.ui;
import java.util.*;

public class Demo11 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Map<String,String> m=new HashMap<String,String>();
		m.put("Rancho","Aamir Khan");
		m.put("Raju","Sharman");
		m.put("Chatur","abc");
		int size=m.size();
		System.out.println("No. of key, value pairs are "+size);
		System.out.println(m);
		
		m.put("Chatur","Omi");
		size=m.size();
		System.out.println("No. of key, value pairs are "+ size);
		System.out.println(m);
		
	}

}
