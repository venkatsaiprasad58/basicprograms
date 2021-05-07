package com.ojas.mocktest;

import java.util.Scanner;

public class OddPalindrome {
	static int isPalindrome(int n)

	{

		int rev = 0;

		for (int i = n; i > 0; i /= 10) {

			rev = rev * 10 + i % 10;

		}

		return (n == rev) ? 1 : 0;

	}

	static void rangePal(int min, int max)

	{

		for (int i = min; i <= max; i++)

			if (isPalindrome(i) == 1 && i % 2 != 0)

				System.out.print(i + " ");

	}

	public static void main(String args[])

	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range");

		rangePal(sc.nextInt(), sc.nextInt());

	}
}
