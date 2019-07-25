package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.lti.bean.Account;
import com.lti.service.AccountService;
import com.lti.service.AccountServiceImpl;

class AccountServiceTest 
{
	AccountService service;
	
	@BeforeAll
	public static void before()
	{
		System.out.println("BeforeAll");
	}
	
	@AfterAll
	public static void after()
	{
		System.out.println("AfterALL");
	}
	
	@BeforeEach
	public void beforeTest()
	{
		System.out.println("Before each test");
		service=new AccountServiceImpl();
	}
	
	@AfterEach
	public void afterTest()
	{
		System.out.println("After each test");
		service =null;
	}
	
	
	@Test			//this method is a test case method
	void testcase1() 
	{
		System.out.println("Testcase1");
	//	AccountService service=new AccountServiceImpl();
		Account ob=new Account(201,"Kapil",LocalDate.now(),70000.00);
		//Assertions.assertEquals(true, service.createNewAccount(ob));
		//assertEquals(true, service.createNewAccount(ob));
		
		assertFalse(service.createNewAccount(ob));			//reinsertion will return False
	}
	
	@Test
	void testcase2() 
	{
		System.out.println("Testcase2");
	//	AccountService service=new AccountServiceImpl();
		assertNotNull(service.getAllAccounts());
		assertTrue(service.getAllAccounts().size()>1);
	}

}
