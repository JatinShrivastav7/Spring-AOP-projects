package com.example.aopDemo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Component;

import com.example.aopDemo.Account;

@Component
public class AccountDao {
	
	private String accountName;
	private String accountType;
	
    public void addAccount(Account theAccount, boolean VipFlag)
    {
        System.out.println(" Inside addAccount() \n");
    }
    
    public void doWork() {
    	System.out.println("Inside doWork()\n");
    	
    }

    public List<Account> findAccounts(boolean flag){
    	
    	//generating an exception
    	if(flag==true)
    	{
    		throw new RuntimeException("Exception thrown successfully");
    	}
    	List<Account> myAccounts = new ArrayList<>();
    	
    	//create sample accounts
    	Account acc1=new Account("John","Silver");
    	Account acc2=new Account("Jilly","Platinum");
    	Account acc3=new Account("Joe","Gold");
    	
    	//adding accounts to the List
    	myAccounts.add(acc1);
    	myAccounts.add(acc2);
    	myAccounts.add(acc3);
    	
    	return myAccounts;
    }
    
    //getters and setters
	public String getAccountName() {
    	System.out.println(getClass() + ": Inside getAccountName()\n");

		return accountName;
	}

	public void setAccountName(String accountName) {
    	System.out.println(getClass() + ": Inside setAccountName()\n");

		this.accountName = accountName;
	}

	public String getAccountType() {
    	System.out.println(getClass() + ": Inside getAccountType()\n");

		return accountType;
	}

	public void setAccountType(String accountType) {
    	System.out.println(getClass() + ": Inside setAccountType()\n");

		this.accountType = accountType;
	}
    
//    public void getEmployee() {
//    	System.out.println("Getter for employee");
//    	
//    }
//    
//    public void setAccount() {
//    	System.out.println("Setter for account");
//    }
    
    
}
