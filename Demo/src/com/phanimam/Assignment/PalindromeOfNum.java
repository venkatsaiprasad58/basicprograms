package com.phanimam.Assignment;

public class PalindromeOfNum {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int l = String.valueOf(num).length();
		if(l == 3) {
			int rem,quo;
			rem = num % 10;
			quo = num / 100;
			System.out.println(" Palindrom  "+ (rem == quo));
		}
		else {
			System.out.println("false");
		}
	}

}
