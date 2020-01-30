package com.sprintqa.java.class11;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean notprime = false; 
		
		System.out.println("Please enter a number to check if it is prime: ");
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("This is not a positive intiger");
						
		} else if (num == 1) {
			System.out.println("This is not a prime number");
		} else {
		   for(int i = 2; i < num; i++) {
			  
			   if(num % i == 0 ) {
				   System.out.println("Not Prime.");
				   notprime = true;
				   break;			   
				 
			 }
		   }
		   
		   
		}
		
		if (notprime == false ) {
			System.out.println("This is prime number.");
		}
	}

}
