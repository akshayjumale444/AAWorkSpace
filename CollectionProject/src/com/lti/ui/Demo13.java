package com.lti.ui;
import java.util.*;
import com.lti.bean.*;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<Account> aset=new TreeSet<Account>();
		/*Comparator nc=new NameComparator ();
		Set<Account>aset=new TreeSet<Account>(cb);
		*/
		Comparator cb=new BalanceComparator ();
		Set<Account>aset=new TreeSet<Account>(cb);
		
		aset.add(new Account(444,"Ram",25000.00));	
		aset.add(new Account(222,"Shyam",22000.00));
		aset.add(new Account(333,"Abdul",35000.00));
		aset.add(new Account(111,"Ganesh",33000.00));
		
		
		for(Account o:aset)
		{
			System.out.println(o);
		}
		
		
		
	 	
	}

}
