package com.gn.study.model.vo;

public class Child extends Parent {
	private int b;
	
	public Child() {
		super(3); // 숫자 3은 int a 값에 들어가는 것 + 부모의 매개변수를 끌어오기위함
//		부모의 기본생성자 있고 기그 기본 생성자를 끌어오고 싶다면 -> 숫자3 없이 비어있는 괄호 필요
//		자식 클래스의 기본 생성자 안에 super(3)의 의미는 
//		부모 클래스의 매개변수 생성자 쪽의 int a 값을 설정해 주는 것
//		확인 하려면 getA 써보면 3 나온다.
		System.out.println("자식의 기본 생성자 호출!!");
	}
	
	public Child(int a, int b) {
		super(a);
		this.b = b;
		System.out.println("자식 매개변수 생성자 호출!!");
	}
}
