package com.ojas.mocktest;

import java.util.Scanner;

public class BiggestArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the "+size+" elements");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int big = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > big) {
				big = num[i];

			}

		}
		System.out.println("Biggest number is : " +big);
	}
}
