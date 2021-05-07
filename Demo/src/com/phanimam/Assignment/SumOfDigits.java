package com.phanimam.Assignment;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("Given number is : "+num);
		int r=0,sum=0;
		{
		r=num%10;
		sum=(sum%10)+r;
		num=num/10;
		}
		if(num==sum)
			System.out.println("true");
		else
			System.out.println("False");
	}

}

