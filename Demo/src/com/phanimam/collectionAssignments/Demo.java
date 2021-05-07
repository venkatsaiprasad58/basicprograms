package com.phanimam.collectionAssignments;

import java.util.Map;
import java.util.TreeMap;

public class Demo {
	private Map<Integer,String> employeeIdNameMap;
	public Demo() {
		employeeIdNameMap = new TreeMap<Integer,String>();	
	}
	public Demo(Map<Integer,String> employeeIdNameMap) {
		this.employeeIdNameMap = employeeIdNameMap;
	}
	public String getEmployeeName(int employeeId) {
		String str = "";
		int count = 0;
		if(employeeIdNameMap == null || employeeIdNameMap.size() == 0) {
			return null;
		}
		else {
			if(employeeIdNameMap.containsKey(employeeId)); {
				str = employeeIdNameMap.get(employeeId);
			}
		}
		if(str.length() == 0) {
			return null;
		}
		else {
			return str;
		}
	}
	public Map<Integer,String> getEmployeeIdNameMap() {
		return employeeIdNameMap;
	}
	public void setEmployeeIdNameMap(Map<Integer,String> employeeIdNameMap)
	{
		this.employeeIdNameMap = employeeIdNameMap;
	}
}

