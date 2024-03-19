/**
 * 
 */
package com.salesforce.service;

import com.salesforce.exception.InSufficientFundException;

/**
 * @author Dell
 *
 */
public class BankService {
	
	// decalre the properties here 
	
	private double balance;
	private int number;
	
	public BankService() {
		
		this.number=number;
	}
	
	// service methods for deposit & withdrawal 
	
	
	public void deposit(double amount) {
		
		balance +=amount;
	}
	
	
	public void withdraw(double amount) throws InSufficientFundException {
		
		if(amount<=balance) {
			
			    balance -= amount;	
		}else {
			
			double needs=amount-balance;
			
			throw new InSufficientFundException(needs);
		}
	}
	
	

}
