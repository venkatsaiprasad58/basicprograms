package com.phanimam.collectionAssignments;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts  = new TreeSet<String>();
		ts.add("ramu");
		ts.add("anvinash");
		ts.add("prasad");
		ts.add("zack");
		ts.forEach(System.out::println);
	}

}
