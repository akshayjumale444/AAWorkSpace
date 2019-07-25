package com.lti.ui;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Account;
import com.lti.service.AccountService;
import com.lti.service.AccountServiceImpl;

public class Demo1 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		AccountService service=new AccountServiceImpl();
		
		//case 1 Accept data
		Account ob=new Account(100,"Ram",LocalDate.of(1995, 8 , 15),25000.00);
		
		//case 2 print all account
		//service.createNewAccount(ob);
		service.withdraw(ob,1000.00);
		List<Account> alist=service.getAllAccounts();
		
		for(Account a:alist)
		{
			System.out.println(a);
			System.out.println("===============================================================");
		}
		
	}
}
