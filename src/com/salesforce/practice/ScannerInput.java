/**
 * 
 */
package com.salesforce.practice;

import java.util.Scanner;

/**
 * @author Dell
 *
 */
public class ScannerInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for taking input from end used java use scanner class & 
		// for File use IO operation with NIO 
		
		System.out.println("Enter the Details of customer -->");
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the id-->");
		int id=scan.nextInt();
		System.out.println("Customer id-->" +id);
		System.out.println("Enter the Name-->");
		String name=scan.next();
		System.out.println("Name of the Customer-->" +name);
        System.out.println("Enter the Address-->");
        String address=scan.next();
        System.out.println("Address of the Customer");
        scan.close();
		
		

	}

}
