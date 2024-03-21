/**
 * 
 */
package com.salesforce.thread;

/**
 * @author Dell
 *
 */
public class NewThread implements Runnable{

	/**
	 * @param args
	 */
	
	 String name;
	 Thread thread;
	
	public NewThread(String name) {
		// TODO Auto-generated constructor stub
	
	   this.name=name;
	   thread=new Thread(this,name);
	   System.out.println("A New Thread" + thread + "is created\n");
	   thread.start();
	}
	

	@Override
	public void run() {

		
		// TODO Auto-generated method stub
		  try {
			  
			  for(int j=5;j>0;j--) {
				  
				  System.out.println(name +":" +j);
				  Thread.sleep(1000);
			  }
		  }catch(InterruptedException ex) {
			  
			  System.out.println(name +"Thread intrputted-->" +ex.getMessage());
		  }
		  
		  System.out.println("name" + " Thread Existing");
	
	}
	

}
