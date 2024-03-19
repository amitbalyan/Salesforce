/**
 * 
 */
package com.salesforce.client;

import com.salesforce.service.CustomerInterface;
import com.salesforce.service.CustomerService;

/**
 * @author Dell
 *
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// call all the Services in code here for lookup 
		
//		CustomerService business=new CustomerService();
		
		CustomerInterface business=new CustomerService();		
		business.createCustomer();
		business.listCustomer();
	//	System.out.println(business.deleteCustomer(101));
	//	System.out.println(business.updateCustomer(101));
		
		 // Console ehen we delelop the Desk
		
		 // Take input from End user :-- > Desk APP // Mobile App/ Web App

	}

}
