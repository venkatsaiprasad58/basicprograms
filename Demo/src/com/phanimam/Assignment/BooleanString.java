package com.phanimam.Assignment;

public class BooleanString {

	public static void main(String[] args) {
		try {
			String s1 = args[0];
			String s2 = args[1];
			if (s1.equals(s2)) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		} catch (NumberFormatException e) {
			System.out.println("error");
		}
	}
}
