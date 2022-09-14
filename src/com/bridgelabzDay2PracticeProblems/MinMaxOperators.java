/**
 * 
 */
package com.bridgelabzDay2PracticeProblems;

/**
 * @author Admin
 *
 */
public class MinMaxOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		
		int first=78;
		int second=70;
		int third=45;
		int firstOperator=first+second*third;
		int secondOperator=first%second*third;
		int thirdOperator=third+first/second;
		int fourthOperator=first*second+third;
		
		if(firstOperator>secondOperator && firstOperator>thirdOperator && firstOperator>fourthOperator) {
			System.out.println("First Operator is Greater Number "  +firstOperator);
		}
		if(secondOperator>firstOperator && secondOperator>thirdOperator && secondOperator>fourthOperator) {
			System.out.println("Second Operator is Greater Number "  +secondOperator);
		}
		if(thirdOperator>secondOperator && thirdOperator>firstOperator && thirdOperator>fourthOperator) {
			System.out.println("Third Operator is Greater Number "  +thirdOperator);
		}
		if(fourthOperator>secondOperator && fourthOperator>thirdOperator && fourthOperator>firstOperator) {
			System.out.println("Fourth Operator is Greater Number "  +fourthOperator);
		}
		else {
			System.out.println("Error Occuured");
		}
		
		if(firstOperator<secondOperator && firstOperator<thirdOperator && firstOperator<fourthOperator) {
			System.out.println("First Operator is Lesser Number "  +firstOperator);
		}
		if(secondOperator<firstOperator && secondOperator<thirdOperator && secondOperator<fourthOperator) {
			System.out.println("Second Operator is Lesser Number "  +secondOperator);
		}
		if(thirdOperator<secondOperator && thirdOperator<firstOperator && thirdOperator<fourthOperator) {
			System.out.println("Third Operator is Lesser Number "  +thirdOperator);
		}
		if(fourthOperator<secondOperator && fourthOperator<thirdOperator && fourthOperator<firstOperator) {
			System.out.println("Fourth Operator is Lesser Number "  +fourthOperator);
		}
	
	}

}
