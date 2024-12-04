package com.gn.study.constructor.model.vo;

public class Car {
	
	private String brand;
	private String color;
	private int year;
	
//	오잉 이렇게도 해도 에러 안뜨네? 왜 구지 this를 쓰는가?
//	일관성 있는 코드 작성 + 유지 보수 확장성.
//	public Car(String b, String c, int y) {
//		brand = b;
//		color = c;
//		year = y;
//	}
	
//	기본 생성자
//	this()는 뒤에 있는 매개변수 생성자를 끌어온다.
//	default 값을 할당해 준다고 생각하면 된다.
//	매개변수 지우고 기본 생성자에서 brand 등등 써보면
//	this() 괄호 안의 값이 나오나 확인해보자
	public Car() {
		this("미정", "미정", 2024);
	}
	
	
//	매개변수 생성자
	public Car(String brand, String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year;
	}
	
	
}
