package com.phanimam.Assignment;

public class GreatestNumber {
	
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		
		if(num1 > num2) {
			System.out.println(num1+" = num1 is Greatest number");
			
		}
		else if(num1==num2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println(num2 +" = num2 is Greatest number");
		}
		
	}

}
