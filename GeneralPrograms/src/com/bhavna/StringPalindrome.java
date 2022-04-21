package com.bhavna;

import java.util.Scanner;

public class StringPalindrome {

	static Scanner scanner = new Scanner(System.in);

	public void comparision() {

		String string1, string2 = "";
		System.out.println("Please enter a string..");
		string1 = scanner.nextLine();
		int lengthOfString = string1.length();
		for (int i = lengthOfString - 1; i >= 0; i--) {
			string2 = string2 + string1.charAt(i);
		}

		if (string1.equalsIgnoreCase(string2)) {
			System.out.println();
			System.out.println("Given string is palindrome..");
		} else {
			System.out.println(" ");
			System.out.println("Given string is not palindrome...");
		}

	}

	public void closing() {
		scanner.close();
		System.out.println("Scanner is closed...");
	}

	public static void main(String[] args) {

		StringPalindrome stringPalindrome = new StringPalindrome();

		int n = 0;
		do {
			stringPalindrome.comparision();
			System.out.println(" ");
			System.out.println("do you want to continue ? enter 1");

			n = scanner.nextInt();
			scanner.nextLine();
		} while (n == 1);

		stringPalindrome.closing();

	}

}
