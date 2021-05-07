package com.ojas.mocktest;

import java.util.Scanner;

public class QuadraticSequence {
	static int count = 1, sum = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		for (int i = 1; i <= 5; i++) {
			sum = i * (i + 1) / 2;
			System.out.println(sum);
		}

	}
}