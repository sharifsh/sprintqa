package com.sprintqa.java.reviewclass;

import java.util.Arrays;

public class SwappingOfNumber {

	public static void main(String[] args) {
		
	
		int[] nums = {14, 56, 37, 0, 23, 9, 2, 80, 67};
		
		for(int i: nums)
		{
			System.out.print(i + " ");
		}
		
		Arrays.sort(nums);
		System.out.println();
		
		for(int i: nums)
		{
			System.out.print(i + " ");
		}
			
		
		
		

	}

}
