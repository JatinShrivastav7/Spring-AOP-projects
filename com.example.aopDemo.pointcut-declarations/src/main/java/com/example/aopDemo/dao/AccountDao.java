package com.example.aopDemo.dao;

import org.springframework.stereotype.Component;

import com.example.aopDemo.Account;

@Component
public class AccountDao {
	
	private String accountName;
	private String accountType;
	
    public void addAccount(Account theAccount, boolean VipFlag)
    {
        System.out.println(getClass()+ ": Adding an account \n");
    }
    
    public void doWork() {
    	System.out.println(getClass() + ": Inside doWork()\n");
    	
    }

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
