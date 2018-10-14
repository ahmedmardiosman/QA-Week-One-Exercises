package com.qa.CollectionsStreams_Exercise_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("The array:\n" + Arrays.toString(oneToOneHundredArray()) + "\n");
		System.out.println("The list:\n");
		oneToOneHundredList().forEach(System.out::println);
		System.out.println("\nThe list multiplied by ten \n");
		listTimesTen(oneToOneHundredList()).forEach(System.out::println);
		
	}


	public static int[] oneToOneHundredArray() {
		int[] arr = new int[100];
		IntStream.range(0, 100).forEach(i -> arr[i] = i + 1);
		return arr;
	}
	
	public static List<Integer> oneToOneHundredList() {
		List<Integer> newList = new ArrayList<Integer>();
		IntStream.range(100,1000).forEach(i -> newList.add(i));
		return newList;
	}
	
	public static List<Integer> listTimesTen(List<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>();
		newList = list.stream().map(i -> i*10).collect(Collectors.toList());
		return newList;
	}
}


