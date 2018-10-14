package com.qa.CalculatorLambdas_Exercise_10;

public class Runner implements MathOperation {

	public static void main(String args[]) {

		Runner tester = new Runner();

		MathOperation addition = (double a, double b) -> a + b;
		MathOperation subtraction = (double a, double b) -> a - b;
		MathOperation multiplication = (double a, double b) -> a * b;
		MathOperation division = (double a, double b) -> a / b;

		System.out.println("42 + 21 = " + tester.operate(42, 21, addition));
		System.out.println("42 - 21 = " + tester.operate(42, 21, subtraction));
		System.out.println("42 x 21 = " + tester.operate(42, 21, multiplication));
		System.out.println("42 / 21 = " + tester.operate(42, 22, division));
	}

	double operate(double a, double b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	@Override
	public double operation(double a, double b) {
		return 0;
	}

}
