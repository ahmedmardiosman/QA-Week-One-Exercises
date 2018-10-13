package com.qa.CheckString_Exercise_3;

public class Runner {

	public static void main(String Arg[]) {

		String firstString = "Ahmed Mardi Osman";

		String secondString = "Ahmed Mardi Osman";

		System.out.println(hardCodedString(firstString));

		System.out.println(sameString(firstString, secondString));

	}

	public static String hardCodedString(String firstString) {

		if (firstString == "Ahmed Mardi Osman") {

			return "Yes the code matches the Hard coded string";

		} else {

			return "No the code does not match the hard coded string";

		}

	}

	public static String sameString(String firstString, String secondString) {

		if (firstString == secondString) {

			return "Yes the two string inputs match";

		} else {

			return "No the two string inputs do not match";
		}

	}

}
