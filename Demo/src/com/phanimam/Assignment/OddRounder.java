package com.phanimam.Assignment;

public class OddRounder {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		if (num % 2 == 0) {
			System.out.println("enen number");
		} else {
			double d = ((Math.ceil(num / 10)) * 10) + 10;
			System.out.println(d);
		}
	}
}