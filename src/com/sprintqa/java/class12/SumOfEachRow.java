package com.sprintqa.java.class12;

public class SumOfEachRow {

	public static void main(String[] args) {
		int[][] numbers = {{10,20,30},{40,50,60},{70,80,90}};
		
		int sum;
		for(int r = 0; r < numbers.length; r++) {
			sum = 0;
			for(int c = 0; c < numbers[r].length; c++) {
			  sum += numbers[r][c];
			}
			    
			System.out.println("Sum of row " + r + " = " + sum);
			
			for(int i = 0; i < numbers.length; i++) {
				
			}
		}

	}

}
