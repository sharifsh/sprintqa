package com.sprintqa.java.class4;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		int age, weight;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		age = sc.nextInt();
		System.out.println("Please enter your weight: ");
		weight = sc.nextInt();
		
		if (age > 18) {
			if (weight >= 50) {
				System.out.println("Eligible for blood donation.");
			} else {
				System.out.println("You are eligible but you can not donate blood due to underweight");
			}
			
		} else {
			System.out.println("Not Eligible for blood donation.");
			
			
		}

	}

}
