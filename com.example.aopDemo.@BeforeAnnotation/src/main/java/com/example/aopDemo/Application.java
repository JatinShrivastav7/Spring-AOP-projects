package com.example.aopDemo;

import com.example.aopDemo.configuration.DemoConfig;
import com.example.aopDemo.dao.AccountDao;
import com.example.aopDemo.dao.MembershipDao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		//read spring configuration java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);

		//get the AccountDao bean from spring container
		AccountDao theAccountDao=context.getBean("accountDao",AccountDao.class);

		//get the MembershipDao bean from the Spring container
		MembershipDao theMembershipDao = context.getBean("membershipDao",MembershipDao.class);
		
		//call the AccountDao addAccount() business method
		theAccountDao.addAccount();

		//call the MembershipDao addaAccount() business method
		theMembershipDao.addSillyAccount();

		//close the context
		context.close();
	}

}
