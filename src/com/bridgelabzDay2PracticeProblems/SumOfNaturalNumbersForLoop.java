/**
 * 
 */
package com.bridgelabzDay2PracticeProblems;

/**
 * @author Admin
 *
 */
public class SumOfNaturalNumbersForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		int num = 5, count, total = 0;

	       for(count = 1; count <= num; count++){
	           total = total + count;
	       }

	       System.out.println("Sum of "+num+ " natural numbers is: "+total);

	}

}
