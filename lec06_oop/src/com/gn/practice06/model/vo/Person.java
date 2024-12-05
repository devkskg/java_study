package com.gn.practice06.model.vo;

public class Person {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
//	변수명을 String 배열에 넣고 인덱스 값이 3,4일때는 if로 강제 형변환 시키고
//	반복되는 변수명을 for문으로 돌려버릴 수 있지 않을까?
//	setid 이런식으로 카멜 케이스 안 되겠지만..
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
//	public Person() {}
//	public Person(String id, String pwd, String name, int age, char gender, String phone, String email) {
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.phone = phone;
//		this.email = email;
//	}
	
	public String information() {
		return "- id : " + id + "\n"
				+ "- pwd : " + pwd + "\n"
				+ "- name : " + name + "\n"
				+ "- age : " + age + "\n"
				+ "- gender : " + gender + "\n"
				+ "- phone : " + phone + "\n"
				+ "- email : " + email;
				
	}

}
