package com.phanimam.Assignment;

public class ThreeValuesRounder {
	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int sum = num1 + num2 + num3;
		double d = ((Math.ceil(sum / 8)) * 10) + 10;
		System.out.println(d);
	}
}
