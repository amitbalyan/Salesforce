/**
 * 
 */
package com.salesforce.exception;

/**
 * @author Dell
 *
 */
public class DemoException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Any Airthmatch Math Exception show case
		try {
			int a = 20, b = 0, c;

			c = a / b;
			System.out.println("value of c after operation --->" + c);
		} catch (ArithmeticException ex) {

			System.out.println("Wrong Arithmatic Opeariton --> " + ex.getMessage());
		}finally {
			
			System.out.println("end of ther program");
			// here need to release the all object like database intraction and file I/O
		}
	}

}
