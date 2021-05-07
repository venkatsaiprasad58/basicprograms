package com.ojas.mocktest;

import java.util.Scanner;

public class EmailId {
	static String printMail(String mail) {
		StringBuilder sb = new StringBuilder(mail);
		String res = "";
		int count = mail.indexOf("@");
		for (int i =count; i > 1; i--) {
			sb.setCharAt(i, '*');
		}
		res = sb.toString();

		return res;

	}

	public static void main(String[] args) {
		System.out.println("Enter Mail ID");
		Scanner sc = new Scanner(System.in);
		String mail_id = sc.next();
		System.out.println(printMail(mail_id));
	}
}
