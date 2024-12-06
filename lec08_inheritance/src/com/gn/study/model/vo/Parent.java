package com.gn.study.model.vo;

public class Parent {
	private int a;
	
	public int getA() {
		return a;
	}
	
//	부모 클래스에 기본 생성자가 없으면 자식 클래스에 오류 난다.
//	해결 방법 2가지
//	방법1. 부모의 기본 생성자를 만들어준다.
	public Parent() {
		System.out.println("부모 기본 생성");
	}
//	방법2. super() 사용!
	
	public Parent(int a) {
		this.a = a;
		System.out.println("부모의 매개변수 생성자지롱~");
	}
}
