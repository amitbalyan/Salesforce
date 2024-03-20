/**
 * 
 */
package com.salesforce.java11;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dell
 *
 */
public class DemoOfForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		// TODO Auto-generated method stub

      // call boith impl 
		
		withOutForEach();
		withForEach();
	}
	
	
	// before java 8 // 11 ineration like this 
	
	private static void withOutForEach() {
		
		System.out.println("withpoutForEach Impl");
		
		// collection list 
		
		List<Integer> inList= Arrays.asList(1,2,3,4,5,6,7,8,9,0,10);
		
		
		// iteration using for loop in Impl 
		
		  for(int i: inList) {
			  
			  System.out.println("element of the list" +i);
		  }
		
		
	}
	
	
	// latest way with for each impl :--> 
	
	
	 private static void withForEach() {
		 
	      	 
		 System.out.println("from withFor Each impl");
		 List<Integer> inList=Arrays.asList(1,2,3,4,5,6,88,99,00,33,32,2,2);
		 
		 // Synatx of For Each 
		 
		 inList.forEach(System.out::println);
		 	 
	 }
	
	
	
	  
	
	
	

}
