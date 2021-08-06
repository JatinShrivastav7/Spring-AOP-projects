package com.example.aopDemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

	public void addSillyAccount()
	{
		System.out.println(getClass() + "Checking @Before in addSillyAccount() of MembershipDao class");
	}
	
	
}
