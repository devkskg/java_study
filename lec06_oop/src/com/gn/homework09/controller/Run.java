package com.gn.homework09.controller;

import com.gn.homework09.model.vo.Student;

public class Run {
public static void main(String[] args) {
	Student s = new Student();
	s.setStudentName("김철수");
	s.setClassName("A");
	System.out.println(s.getStudentNum() + " " + s.getStudentName() + " " + s.getClassName());
	
	
	Student s1 = new Student();
	s1.setStudentName("홍길동");
	s1.setClassName("F");
	System.out.println(s1.getStudentNum() + " " + s1.getStudentName() + " " + s1.getClassName());
	
	Student s2 = new Student();
	s2.setStudentName("김영희");
	s2.setClassName("B");
	System.out.println(s2.getStudentNum() + " " + s2.getStudentName() + " " + s2.getClassName());
}
}
