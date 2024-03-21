/**
 * 
 */
package com.salesforce.thread;

/**
 * @author Dell
 *
 */
// WE can Implement the Thread using extends the Thread Classs
// implement the Runnable interface

// both have the run method in which need to place the bisiness 
// code
public class ThreadSample  extends Thread{

	/**
	 * @param args
	 */
	
	// run method to perform the Action for Thread

	//start---- run---- sleep -- wiat----stop
	
	public void run() {
		
	  // addition 
		int a=10;
		int b=20; 
		double result= a+b;
		System.out.println("Thread is started for Run-->");
		System.out.println(" Result of the number-->" +result);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ThreadSample thread=new ThreadSample();
        // calling the thread 
        thread.start();
	
	}

}
