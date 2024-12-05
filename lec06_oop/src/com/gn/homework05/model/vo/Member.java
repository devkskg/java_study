package com.gn.homework05.model.vo;

public class Member {
	private String memberid;
	private String memberPwd;
	private String memberName;
	private int age;
	private String phone;
	private String email;
	
	public Member() {}
	
	public void changeName(String name) {
		memberName = name;
	}
	
	public void printName() {
		System.out.println("이름 : " + memberName);
	}
	
	
}
