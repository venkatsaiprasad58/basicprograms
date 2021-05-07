package com.ojas.mocktest;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the elements");
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		System.out.println("The sum of an array is " + sum);
	}
}
