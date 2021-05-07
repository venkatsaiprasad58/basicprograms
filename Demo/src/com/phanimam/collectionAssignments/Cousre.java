package com.phanimam.collectionAssignments;

import java.util.ArrayList;
import java.util.List;

public class Cousre {
	private int courseId;
	private String courseName;
	 List<Student> list;
	
	public void display(int studentsInCourse[]) {
		
	}
	
	public Cousre() {
		super();
	}

	public Cousre(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public String displayCourseDetails() {
		return "Cousre [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
	public void addStudentToCourse(Student stu) {
		List<Student> s = new ArrayList<Student>();
		s.add(stu);
	}
}
