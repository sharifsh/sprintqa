package com.sprintqa.java.reviewclass;

public class StringExampleHW {

	public static void main(String[] args) {
		String str = "This is string program we learning from java concept";
		
		char c = 't';
		int count = 0; 
		
		for(int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 't') {
				count++;
			}
		}
		System.out.println(count);

	}

}
