package com.phanimam.Assignment;

public class DigitChecker {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("Given number is : "+num);
		int r=0,diff=0;
		{
		r=num%10;
		num=num/10;
		diff =-(diff - r);
		}
		System.out.println("Sum of the two digits: "+diff);
	}
}
