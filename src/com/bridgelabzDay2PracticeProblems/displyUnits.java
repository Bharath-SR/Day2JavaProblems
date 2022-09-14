package com.bridgelabzDay2PracticeProblems;

import java.util.*;
public class displyUnits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number to find units ");
		int n=scanner.nextInt();
		
		if(n>0 && n<10) {
			System.out.println("Unit of entred number is ONE'S");
		}
		else if(n>=10 && n<100) {
			System.out.println("Unit of entred number is TEN'S");
		}
		else if(n>=100 && n<1000) {
			System.out.println("Unit of entred number is Hundred's");
		}
		else if(n>=1000 && n<10000) {
			System.out.println("Unit of entred number is Thousands'S");
		}
		else {
			System.out.println("Unit not found");
		}
	}

}
