/**
 * 
 */
package com.salesforce.thread;

/**
 * @author Dell
 *
 */
public class ThreadSample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NewThread("1st");
		new NewThread("2nd");
		new NewThread("3rd");
		try {
			
           Thread.sleep(3000);			
			
		}catch ( InterruptedException ex) {
			// TODO: handle exception
			System.out.println("Intrputted occurs in main Thread");
		}
		
		System.out.println("We are existing in main thread");
	}

}
