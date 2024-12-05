package com.gn.homework09.model.vo;

public class Student {
//	int i = 1;
	private static int studentNum = 0;
	
	private String studentName = "";
	private String className = "A";
	
	public Student() {
		studentNum++;
	}
	
	
	public Student(int studentNum, String studentName, String className) {
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.className = className;
	}


	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public int getStudentNum() {
		return studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getClassName() {
		return className;
	}
	
}
