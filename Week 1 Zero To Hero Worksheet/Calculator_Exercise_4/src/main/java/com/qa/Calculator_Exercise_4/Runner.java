package com.qa.Calculator_Exercise_4;

public class Runner {

	public static int a = 22;

	public static int b = 7;

	/*
	 * Here we can type in what operator we want to use either: addition Subtraction
	 * multiplication division
	 */
	public static String operator = "division";

	public static void main(String Args[]) {

		answer(a, b, operator);

	}

	public static void answer(int a, int b, String operator) {

		switch (operator) {
		case "addition":
			int sum = a + b;
			System.out.println("The sum of integer " + a + " and " + b + " is " + sum);
			break;

		case "subtraction":
			int difference = a - b;
			System.out.println("The difference between of integer " + a + " and " + b + " is " + difference);
			break;

		case "multiplication":
			int multiply = a * b;
			System.out.println("If we multiply integer " + a + " and " + b + " we get " + multiply);
			break;

		case "division":
			// implicit casting
			double divide = (double) a / b;
			System.out.println("If we divide integer " + a + " and " + b + " we get " + divide);
			break;

		default:
			System.out.println("Sorry you have not put in a correct operator");
			break;

		}

	}

}
