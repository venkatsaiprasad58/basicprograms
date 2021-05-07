package com.phanimam.collectionAssignments;

import java.util.Scanner;
import java.util.Stack;

public class PlaindromeOrNot {

	public static void main(String[] args) {
		
		String rev = "";
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the name");
		String str = sc.nextLine();
		Stack stack = new Stack();
		for(int i= 0; i < str.length();i++ ) {
			stack.push(str.charAt(i));
		}
		while(!stack.isEmpty()) {
			rev += stack.pop();
		}
		if(str.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	} 

}
