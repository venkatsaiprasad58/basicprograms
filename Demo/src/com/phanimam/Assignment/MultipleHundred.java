package com.phanimam.Assignment;

public class MultipleHundred {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		double d = ((Math.ceil(num / 100)) * 100) + 100;
		System.out.println(d);

	}

}
