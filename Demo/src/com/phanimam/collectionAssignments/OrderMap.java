package com.phanimam.collectionAssignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class OrderMap {
	private static Map<Integer, String> insertionOrderMap;

	public OrderMap() {
		insertionOrderMap = new HashMap<Integer, String>();
	}

	public Map<Integer, String> getInsertionOrderMap() {
		return insertionOrderMap;
	}

	public void setInsertionOrderMap(Map<Integer, String> insertionOrderMap) {
		this.insertionOrderMap = insertionOrderMap;
	}

	public static void addElement(int key, String value) {
		insertionOrderMap.put(1, "prasad");
		insertionOrderMap.put(3, "phani");
		insertionOrderMap.put(2, "ramu");
	}
}