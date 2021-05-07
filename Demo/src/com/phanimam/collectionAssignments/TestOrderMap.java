package com.phanimam.collectionAssignments;

import java.util.HashMap;
import java.util.Map;

public class TestOrderMap {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		OrderMap o = new OrderMap();
		o.addElement(0, null);
		System.out.println(o.getInsertionOrderMap());
	}

}