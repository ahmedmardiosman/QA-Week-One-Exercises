package com.qa.Collections_Exercise_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		System.out.println("The array:\n" + Arrays.toString(oneToOneHundredArray()) + "\n");

		System.out.println("The list:\n" + oneToOneHundredList() + "\n");

		System.out.println("The list multiplied by 10 is:\n" + listTimesTen() + "\n");

		System.out.println("The preffered list multiplied by 10 is:\n" + listTimesTen2(oneToOneHundredList()));

	}

	public static int[] oneToOneHundredArray() {

		int arrayOfIntegers[] = new int[100];

		int x = 0;

		for (int i = 1; i < 101; i++) {

			arrayOfIntegers[x] = i;
			x = x + 1;
		}
		return arrayOfIntegers;

	}

	public static List<Integer> oneToOneHundredList() {

		List<Integer> integerList = new ArrayList<Integer>();

		for (int i = 100; i < 1000; i++) {

			integerList.add(i);

		}

		return integerList;

	}

	public static List<Integer> listTimesTen() {

		List<Integer> integerListTimesTen = new ArrayList<Integer>();

		for (int i = 100; i < 10000; i++) {

			int q = i * 10;
			integerListTimesTen.add(q);

		}
		return integerListTimesTen;

	}

	public static List<Integer> listTimesTen2(List<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer i : list) {
			newList.add(i * 10);
		}
		return newList;
	}

}
