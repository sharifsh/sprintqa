package com.sprintqa.java.class18;

public class Methods {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		
		System.out.println("    Hello World!");
		prline();
		System.out.println("    add " + addTwo(num1, num2));
		prline();
		System.out.println("    sub " + subTwo(num1, num2));
		prline();
		System.out.println("    mil " + (num1 * num2));
		prline();
		System.out.println("    div " + (num1 / num2));
		prline();
	}
	
	public static void prline() {
		System.out.println("===================");
	}

	public static int addTwo(int a, int b) {
		return a + b; 
	}
	
	public static int subTwo(int a, int b) {
		return a - b; 
	}
}
