package com.gn.homework01.model.vo;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "===" + name + "===" + "\n" 
				+ "나이 : " + super.getAge() + "\n" 
				+ "키 : " + super.getHeight() + "\n" 
				+ "몸무게 : " + super.getWeight() + "\n" 
				+ "급여 : " + salary + "\n" 
				+ "부서 : " + dept;
	}

}
