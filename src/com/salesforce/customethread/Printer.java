/**
 * 
 */
package com.salesforce.customethread;

/**
 * @author Dell
 *
 */
public class Printer {

	public void printTable(int n) {

		// we will use the Sync block to make code Thread safe

		synchronized (this) {

			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {

					Thread.sleep(200);
				} catch (Exception ex) {
					// TODO: handle exception

					System.out.println(ex.getMessage());
				}
			}
		}
	}

}
