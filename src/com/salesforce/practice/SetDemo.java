/**
 * 
 */
package com.salesforce.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Dell
 *
 */
public class SetDemo {

	/**
	 * @param args
	 */
	
	// Set :-- set is collection which will not allow the depulicate data 
	// this is the fastest collection which will access randomly the data
	// this collection implemented by the HasSet/ TreeSet
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Simply array 
		
		int count[]= {34,54,67,87,89,54,54};
		
		// set Implementation 
		
		Set set=new HashSet();
		
		// adding value in this set using loop 
		
		try {
			
		    for(int i=0;i<=5;i++) {
		    	
		    	// add data in set 
		    	
		    	set.add(count[i]);
		    }
		
		  System.out.println("Print the Set Collection here->" +set);

		  // all the set collection put the TreeSet 
		  
		  TreeSet<Integer> sortedSet=new TreeSet<Integer>(set);
		  
		  System.out.println("the sorted collection here-->" +sortedSet);
	
		  // get the first element form the treeset
		  System.out.println("Get the element of collection -->" +sortedSet.first());
		  
		}catch(Exception ex) {
			
			System.out.println("Exception raised -->" +ex.getMessage());
		}
		
  }

}
