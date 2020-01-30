package com.sprintqa.java.class8;

public class SeriesProgram2 {

	public static void main(String[] args) {
       double sum = 0; 
       
       for(double i = 1, j = 2; i <= 11; i++, j++) {
    	   sum = sum + (i/j);
    	   System.out.println(sum);
       }
       
       
	}

}
