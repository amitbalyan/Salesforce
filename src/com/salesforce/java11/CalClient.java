/**
 * 
 */
package com.salesforce.java11;

/**
 * @author Dell
 *
 */
public class CalClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// china Cal 
		
		ChinaCalculator cal=new ChinaCalculator();
		System.out.println("china addition-->" +cal.addition(10, 10));
		System.out.println("china Substraction-->" +cal.substract(20, 10));
		System.out.println("china Multiplication-->" +cal.multiply(10, 10));
        System.out.println("china divide--->" +cal.divide(10, 20));
        
        
        // india Cal 
        
        IndianCalculator cal1=new IndianCalculator();
        System.out.println("Indian addition-->" +cal1.addition(10, 10));
		System.out.println("Indian Substraction-->" +cal1.substract(20, 10));
		System.out.println(" Indian Multiplication-->" +cal1.multiply(10, 10));
		System.out.println("Indian divide--->" +cal1.divide(10, 20));
        
        
        
        
        
		
		
		
		
	}

}
