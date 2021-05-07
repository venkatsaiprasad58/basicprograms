package com.ojas.mocktest;

import java.util.Scanner;

class Test {
	static int fact(int num) {
		int res;
		if (num == 1) {
			return 1;
		}
		return res = fact(num - 1) * num;
	}
}

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		Test t = new Test();
		System.out.println(t.fact(sc.nextInt())+" is  Factorial for an given number ");
	}

}