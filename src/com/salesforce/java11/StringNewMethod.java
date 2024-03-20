/**
 * 
 */
package com.salesforce.java11;

/**
 * @author Dell
 *
 */
public class StringNewMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        beforeJava11();
        fromJava11();
	}
	
	
	// String manuplutation before Java8/11
	
	private static void beforeJava11() {
		

		 String str= "";
		 
		 
		 // string check 
		 
		 if(str.length() == 0) {
			 
			 System.out.println(" String is blank-->");
		 }
		 if(str.equals("")) {
			 
			 System.out.println("String is blnak-->");
			 
	    }
		 if(str.isEmpty()) {
			 
			 System.out.println("String is blank -->");
		 }
		
	}

	private static void fromJava11() {
		
		System.out.println(" from java 11 changes");
		
		String str= "";
		
		if(str.isBlank()) {
	
			System.out.println("String is blank -->");
		}else {
			
			System.out.println("not blank");
		}
			
	}
	
	
	
}
