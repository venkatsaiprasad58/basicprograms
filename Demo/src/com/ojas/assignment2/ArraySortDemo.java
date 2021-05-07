package com.ojas.assignment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.ojas.practice.EmployeeDemo;


public class ArraySortDemo {
	
	public static void main(String[] args) {
		List<EmployeeDemo> list = new ArrayList<EmployeeDemo>();
		list.add(new EmployeeDemo(10,"prasad",34000));
		list.add(new EmployeeDemo(40, "sreenivas", 40000));
		list.add(new EmployeeDemo(30, "phani", 90000));
		list.add(new EmployeeDemo(20, "harish", 20000));
		list.add(new EmployeeDemo(50, "venu", 10000));
		
		
		
		//list.stream().filter(x->x.getSalary()>20000).forEach(System.out::println);
		
		list.stream().sorted((emp1,emp2)->emp1.getEmpid()-emp2.getEmpid()).forEach(System.out::println);
		
	}
}