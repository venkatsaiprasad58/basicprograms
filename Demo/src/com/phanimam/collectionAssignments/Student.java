package com.phanimam.collectionAssignments;

public class Student {
	private int studentId;
	private String studentName;
	private int marks;
	
	
	
	public Student() {
		//default constructor
	}

	public Student(int studentId, String studentName, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public String displayStudentDetails() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}

	

}
