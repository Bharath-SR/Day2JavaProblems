package com.bridgelabzDay2PracticeProblems;

import java.util.*;
public class singleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number to convert to Word: ");
		int n=scanner.nextInt();
		
		if(n==1) {
			System.out.println("ONE");
		}
		else if(n==2) {
			System.out.println("TWO");
		}
		else if(n==3) {
			System.out.println("THREE");
		}
		else if(n==4) {
			System.out.println("FOUR");
		}
		else if(n==5) {
			System.out.println("FIVE");
		}
		else if(n==6) {
			System.out.println("SIX");
		}
		else {
			System.out.println("Number Not Found");
		}
	}

}
