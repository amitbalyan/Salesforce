/**
 * 
 */
package com.salesforce.service;

/**
 * @author Dell
 *
 */
public interface CustomerInterface {

	public void createCustomer();
	public boolean deleteCustomer(int customerID);
	public void listCustomer();
	public boolean updateCustomer(int customerID);

}

