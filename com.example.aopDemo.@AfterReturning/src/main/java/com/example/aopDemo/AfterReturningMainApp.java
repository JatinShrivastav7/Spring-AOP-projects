package com.example.aopDemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aopDemo.configuration.DemoConfig;
import com.example.aopDemo.dao.AccountDao;

public class AfterReturningMainApp {

	public static void main(String args[])
	{
		//read spring configuration java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);

		//get the AccountDao bean from spring container
		AccountDao theAccountDao = context.getBean("accountDao",AccountDao.class);
		
		//call method to find accounts
		List<Account> theAccounts = theAccountDao.findAccounts();
		
		//display the accounts
		System.out.println("\n\nMainProgram: AfterReturningDemoApp");
		System.out.println(theAccounts);
		System.out.println("\n");
		
		
		context.close();
	}
}
