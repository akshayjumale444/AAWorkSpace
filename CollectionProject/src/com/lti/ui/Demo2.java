package com.lti.ui;
import com.lti.bean.*;
import java.util.*;

public class Demo2 
{
	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		ArrayList<Account> alist=new ArrayList<Account>();
		
		alist.add(new Account(111,"Ram",25000.00));
		alist.add(new Account(522,"Sham",22000.00));
		alist.add(new Account(333,"Ganesh",10000.00));
		alist.add(new Account(233,"Krishna",12000.00));
		alist.add(new Account(433,"Durga",45000.00));
		
			for(Account a:alist)
		{
			System.out.println(a);		//to string();
		}

	}

}
