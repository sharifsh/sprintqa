package com.sprintqa.java.class5;

import java.util.Scanner;

public class CaseStmt {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select from 1 - 7 ");
		
		int choice = sc.nextInt();
		
		switch(choice) 
		{
		case 1: System.out.println("You selected Monday"); break; 
		case 2: System.out.println("You selected Tuesday"); break;
		case 3: System.out.println("You selected Wednesday"); break;
		case 4: System.out.println("You selected Thursday"); break;
		case 5: System.out.println("You selected Friday"); break;
		case 6: System.out.println("You selected Sarturday"); break;
		case 7: System.out.println("You selected Sunday"); break;
		
		default: System.out.println("Please select from 1-7"); 
		}
		

	}

}
