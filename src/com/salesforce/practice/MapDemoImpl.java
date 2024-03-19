/**
 * 
 */
package com.salesforce.practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author Dell
 *
 */
public class MapDemoImpl {

	/**
	 * @param args
	 */
	
	// Map is collection which can be implemented by hashmap Treemap 
	// its contains the key and value pair for managing the model data in java 
	// key always be unique & data can be depulicate 
	// In hasMap it contains the data in ramdom manner but in Treemap collection data must be 
	// manage in order 
	// All collection class's is the part of java.utils.*
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration here 
		
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		
		// Add Data in collection
		
		hm1.put(101, "Delhi");
		hm1.put(102, "Mumbai");
		hm1.put(103, "Blore");
		hm1.put(104, "channai");
		hm1.put(101, "New York");
		
		
		// Add data in Treemap 
		
		hm.put(101, "Tamoto");
		hm.put(102, "Patato");
		hm.put(103, "lady Finger");
		hm.put(104, "cucumber");
		hm.put(101, "brinjel");
		
		
		//itereate the both collection 
		
		for(Entry m:hm1.entrySet()) {
			
			System.out.println("value of the map with haspmap coillection-->" +m.getKey() + "-" +m.getValue());
		}
		
		
		// TreeMap Itetration 
		
      for(Entry m:hm.entrySet()) {
			
			System.out.println("value of the map with treemap coillection-->" +m.getKey() + "-" +m.getValue());
		}
		
		
		
		
		
		
		
		
		
	}

}
