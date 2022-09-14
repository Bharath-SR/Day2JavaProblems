/**
 * 
 */
package com.bridgelabzDay2PracticeProblems;

/**
 * @author Admin
 *
 */
public class ReverseANumber {

	/**
	 * @param args
	 */
		  
	    static int reverse(int n)
	    {
	        int revNum = 0;
	        while (n > 0) {
	            revNum = revNum * 10 + n % 10;
	            n = n / 10;
	        }
	        return revNum;
	    }
	 
	   
	    public static void main(String[] args)
	    {
	        int n=67;
	       
	        System.out.println("The reverse number is " + reverse(n));
	    }
	}

