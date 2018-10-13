package com.qa.Calculator_Exercise_2;

public class Runner {

	public static int a = 1223;
	public static int b = 651;
	
	public static void main(String Args[]) {

		System.out.println("If we add integers " + a + " and " + b + " it returns " + addition(a, b));
		
		System.out.println("\nIf we subtract integers " + a + " and " + b + " it returns " + subtraction(a, b));

		System.out.println("\nIf we multiply integers " + a + " by " + b + " it returns " + multiplication(a, b));
		
		System.out.println("\nIf we divide integers " + a + " by " + b + " it returns " + division(a, b));
	}

	public static int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int subtraction(int a, int b) {
		int difference = a - b;
		return difference;
	}
	
	public static int multiplication(int a, int b) {
		int multiply = a * b;
		return multiply;		
	}
	
	public static double division(double a, double b) {
		double divide = a / b;
		return divide;		
	}

}
