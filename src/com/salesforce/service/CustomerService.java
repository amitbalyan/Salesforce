/**
 * 
 */
package com.salesforce.service;

import java.util.ArrayList;
import java.util.List;

import com.salesforce.bean.Customer;

/**
 * @author Dell
 *
 */
public class CustomerService {
	
	
	// Services are methods which is using for logic impl.
	// Storage :--> Data Structure :--> 
	
	// 1. Array :-- Commonly used in C / C++/Python/ Java/ go / Groovey
	// 2. Collection :-->  discuss tommorow
	
	  // int a[]  // int a[][] // Custome array 
	
   //Customer salesForceCustomer[]=new Customer[] {new Customer(),new Customer(),new Customer()};
	
	// We use collection to transform the code 
	
	List <Customer> salesForceCustomer=new ArrayList<Customer>();
	
		
	public void createCustomer() {
		
		System.out.println("customer is created with Array");
		// Record 1
		/*salesForceCustomer[0].setCustomerId(101);
		salesForceCustomer[0].setCustomerName("Abi");
		salesForceCustomer[0].setCustomerAddress("Blore");
		
		// Record 2 
		
		salesForceCustomer[1].setCustomerId(102);
		salesForceCustomer[1].setCustomerName("amy");
		salesForceCustomer[1].setCustomerAddress("Hyd");
		
		// Record 3
		
		salesForceCustomer[2].setCustomerId(103);
		salesForceCustomer[2].setCustomerName("Vinay");
		salesForceCustomer[2].setCustomerAddress("Mumbai");
	*/
		
		 // Add with Colection 
		
		//record 1
		Customer customer1=new Customer();
		customer1.setCustomerId(101);
		customer1.setCustomerName("Bhavesh");
		customer1.setCustomerAddress("Delhi");
		salesForceCustomer.add(customer1);
		
		// Record 2 
		Customer customer2=new Customer();
		customer2.setCustomerId(102);
		customer2.setCustomerName("amy");
		customer2.setCustomerAddress("Blore");
		salesForceCustomer.add(customer2);
		// Record 3 
		
		Customer customer3=new Customer();
		customer3.setCustomerId(101);
		customer3.setCustomerName("Bhavesh");
		customer3.setCustomerAddress("Delhi");
		salesForceCustomer.add(customer3);
		
		
		
		
	}
	
	
	public boolean deleteCustomer(int customerID) {
		
		System.out.println("customer is Deleted by Id-->" +customerID);
		
		return true;
	}
	
	
	public void listCustomer() {
		
		
		System.out.println("<----Print Customer here ---->");
		
		// iteration of the Customer Details 
		// Latest loop in Java 8 onwards we use 
		for(Customer customer:salesForceCustomer) {
			
			System.out.println("Customer Details-->" +customer.getCustomerId() 
			+"--" +customer.getCustomerName() + "--" +customer.getCustomerAddress());
		}
		
	}

	public boolean updateCustomer(int customerID) {
		
		
		System.out.println("Customer is updated ---->" +customerID);
		
		return true;
	}
	
}
