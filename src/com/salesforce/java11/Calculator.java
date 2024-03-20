/**
 * 
 */
package com.salesforce.java11;

/**
 * @author Dell
 *
 */

// the role of interface is declaration of the services 
// this product must be lunch in china / India
public interface Calculator {

	public default double addition(int a, int b) {
		
		
		 return a+b;
	}
	public double substract(int a, int b);
	public double multiply(int a, int b);
	public double divide(int a, int b);
}
