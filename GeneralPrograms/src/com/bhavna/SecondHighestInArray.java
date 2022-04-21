package com.bhavna;

import java.util.Scanner;

public class SecondHighestInArray {

	static Scanner scanner = new Scanner(System.in);

	public static void finding() {

		System.out.println("Enter the size array");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the array Elements");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		int temp;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				temp = max;
				max = arr[i];
				second_max = temp;
			} else if (arr[i] > second_max && arr[i] != max) {
				second_max = arr[i];
			}
		}

		if (second_max == Integer.MIN_VALUE) {
			System.out.println("No Second Highest value");
		} else {
			System.out.println("Second largest numer is :" + second_max);
		}
	}

	public static void closing() {
		scanner.close();
		System.out.println("Scanner is closed...");
	}

	public static void main(String[] args) {

		int n = 0;
		do {
			finding();
			System.out.println(" ");
			System.out.println("do you want to continue ? enter 1");

			n = scanner.nextInt();

		} while (n == 1);
		closing();

	}

}
