/**
 * 
 */
package com.bridgelabzDay2PracticeProblems;

/**
 * @author Admin
 *
 */
public class ReverseANumberForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		 
	    int num = 67, reversed = 0;

	    for(;num != 0; num /= 10) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + reversed);

	}

}
