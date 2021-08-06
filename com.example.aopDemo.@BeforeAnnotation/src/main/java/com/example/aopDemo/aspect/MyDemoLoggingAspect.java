package com.example.aopDemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	//this is where we add all of our related advices for logging
	
	// @Before advice
	// Below Pointcut expression match any addAccount() method in 
	// any class in com.example.aopDemo.dao package
	
	@Before("execution(public void com.example.aopDemo.dao.*.addAccount())")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n====>>> Executing @Before advice on addAccount()");
	}
	
	// Below Pointcut expression match any method starting with "add" 
	// and having any number of arguments of any type and present in 
	// any class in com.example.aopDemo.dao package 
	@Before("execution(* com.example.aopDemo.dao.*.add*(..))")
	public void beforeAnyAddMethod()
	{
		System.out.println("\n====>>> Executing @Before advice on any method with any number of arguments and starting with add \n");
	}
	
	
	
	

}
