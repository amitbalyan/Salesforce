/**
 * 
 */
package com.salesforce.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection Imple of List with ArrayList 
		// <> this is generic symbol which is uisng to type safe the Collection Obj
		List<String> list=new ArrayList<String>();
		
		// Add the Object    :-- creation method
		list.add("Bhavesh");
		list.add("adbul");
		list.add("amy");
		list.add("yabbado");
		list.add("hello");
		
		// size of the collection 
		
		System.out.println("size of collection in java-->" +list.size());
		

         //listing of collection // iteration 
		
		for(String value: list) {
			
			System.out.println("All data-->" +value);
		}

		 // Remove the element & object 
		
		
		
	}

}
