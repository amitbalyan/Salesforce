/**
 * 
 */
package com.salesforce.exception;

/**
 * @author Dell
 *
 */

// when we design the Custome Exception in java we always extends the exception class
public class InSufficientFundException extends Exception {

	
	    // decalare the domain variable 
	
	    private double amount;
	    
	    public InSufficientFundException(double amount) {
			// TODO Auto-generated constructor stub
	    	this.amount=amount;
	    		    	
		}
			
        // custume method which is return the less amont how mush less for withdrawal	
	
	     public double getAmount() {
	    	 
	    	 return amount;
	     }
}
