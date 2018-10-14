package com.qa.PrintNumbers_Exercise_5;

public class Runner {

	public static String[] wordsOneToTen = new String[] { " ", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
			"Eight", "Nine", "Ten" };

	public static String[] wordsElevenToNineteen = new String[] { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
			"Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	public static String[] wordsInTens = new String[] { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
			"Eighty", "Ninety" };

	public static String[] wordsInHundreds = new String[] { "One Hundred", "Two Hundred", "Three Hundred",
			"Four Hundred", "Five Hundred", "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred" };

	public static void main(String Args[]) {

		System.out.println("The numbers between One to ten are as follows:\n\n" + oneToTenInNumbers() + "\n");

		System.out.println("The numbers between One to one hundred are as follows:\n\n" + oneToAHundredInNumbers());

		System.out.println(
				"Using the method to print out the numbers between One to ten in words we get:\n" + oneToTenInWords());

		System.out.println("Using the method to print out the numbers between One to one hundred in words we get:\n"
				+ oneToOneHundredInWords() + "One Hundred\n");

		System.out.println("Using the method to print out the numbers between One to one Thousand in words we get:\n"
				+ oneToOneHundredInWords() + oneHundredToThousandInWords());

	}

	public static String oneToTenInNumbers() {

		String numbers = "";

		for (int i = 1; i < 11; i++) {

			if (i == 10) {

				numbers = numbers + i;

			} else {

				// The '+' sign Concatonates Strings
				numbers = numbers + i + ", ";
			}
		}
		return numbers;
	}

	public static String oneToAHundredInNumbers() {

		String numbers = "";

		for (int i = 1; i < 101; i++) {

			// The '+' sign Concatonates Strings
			numbers = numbers + i + "\n";
		}
		return numbers;
	}

	public static String oneToTenInWords() {

		String words = "";

		for (int i = 0; i < 11; i++) {

			words = words + wordsOneToTen[i] + "\n";

		}
		return words;

	}

	public static String oneToOneHundredInWords() {

		String words = "";

		int i = 0;
		while (i < 11) {

			words = words + wordsOneToTen[i] + "\n";
			i = i + 1;
		}

		int x = 0;
		while (x < 9) {

			words = words + wordsElevenToNineteen[x] + "\n";
			x = x + 1;
		}

		int y = 0;
		while (y < 8) {

			int p = 0;
			while (p < 10) {
				words = words + wordsInTens[y] + " " + wordsOneToTen[p] + "\n";
				p = p + 1;

			}
			y = y + 1;
		}

		return words;

	}

	public static String oneHundredToThousandInWords() {

		String words = "";

		int a = 0;
		while (a < 9) {

			int q = 0;
			while (q < 11) {

				words = words + wordsInHundreds[a] + " " + wordsOneToTen[q] + "\n";
				q = q + 1;
			}

			int r = 0;
			while (r < 9) {

				words = words + wordsInHundreds[a] + " " + wordsElevenToNineteen[r] + "\n";
				r = r + 1;
			}

			int b = 0;
			while (b < 8) {

				int c = 0;
				while (c < 10) {

					words = words + wordsInHundreds[a] + " " + wordsInTens[b] + " " + wordsOneToTen[c] + "\n";
					c = c + 1;

				}
				b = b + 1;
			}

			a = a + 1;
		}

		words = words + "One Thousand";

		return words;

	}

}

