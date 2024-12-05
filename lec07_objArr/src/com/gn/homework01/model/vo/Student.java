package com.gn.homework01.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		this(1,1,"빈칸",1,1,1);
	}
	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		}
	
	public String information() {
		return "=== " + grade + "학년 " + classroom + "반 " + name + " ===" + "\n" 
				+ "국어 : " + kor + "\n" 
				+ "영어 : " + eng + "\n" 
				+ "수학 : " + math + "\n" 
				+ "평균 : " + (kor + eng + math) / 3;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int geteng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
//		return "학년 : " + grade + "\n" 
//				+ "반 : " + classroom  + "\n" 
//				+ "이름 : " + name + "\n" 
//				+ "국어점수 : " + kor + "\n" 
//				+ "영어점수 : " + eng + "\n" 
//				+ "수학점수 : " + math;
	
	
	
	
	
	
}
