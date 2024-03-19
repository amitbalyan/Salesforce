/**
 * 
 */
package com.salesforce.client;

import com.salesforce.exception.InSufficientFundException;
import com.salesforce.service.BankService;

/**
 * @author Dell
 *
 */
public class BankClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankService service=new BankService();
		System.out.println("Depositing the $500 here -->");
		service.deposit(500.00);
		
		try {
			
		    System.out.println("\n withdraw the $100 here-->");
		    service.withdraw(100.00);
		    
		    System.out.println("\n withdraw the $600 here-->");
		    service.withdraw(600.00);
			
		}catch (InSufficientFundException ex) {
			// TODO: handle exception
			System.out.println("Sorry , but you are short $--->" +ex.getAmount());
		}
		}
		
}