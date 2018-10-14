package com.qa.CheckStringLambdas_Exercise_9;

public class Runner implements NameString {

	public static void main(String[] args) {

		String nameOne = "Ahmed";

		String nameTwo = "Ahmed";

		NameString checker = (FirstString, SecondString) -> FirstString.equals(SecondString);

		System.out.println(checker.check(nameOne, nameTwo));

	}

	@Override
	public boolean check(String FirstString, String SecondString) {
		return false;
	}

}