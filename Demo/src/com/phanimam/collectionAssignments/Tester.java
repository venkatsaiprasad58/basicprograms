package com.phanimam.collectionAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListSorter {
	public static void sortIntList(List<Integer> inputList) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(134);
		list.add(954);
		list.add(656);
		list.add(354);

		Collections.sort(list);

		for (int elements : list) {
			System.out.println(elements);
		}
	}
}

public class Tester {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		ListSorter l = new ListSorter();
		l.sortIntList(list);

	}
}
