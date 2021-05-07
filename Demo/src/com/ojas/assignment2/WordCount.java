package com.ojas.assignment2;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to count");
		String str = sc.nextLine();
		int count = 1;
		for(int i = 0;i < str.length(); i++) {
				if(str.charAt(i) == ' ') {
					count++;
				}
		}
		System.out.println("Word count is: "+count);

	}

}
