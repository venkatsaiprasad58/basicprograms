package com.ojas.mocktest;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the " + size + " numbers");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println("Even numbers in array " + num[i]);
			}

		}

	}
}