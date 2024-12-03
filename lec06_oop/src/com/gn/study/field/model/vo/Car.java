package com.gn.study.field.model.vo;

public class Car {
//	인스턴스 변수(필드)
//	명시적 초기화
	public static final String name = "avante";
//	클래스 다이어그램으로 표현하면
//	+ NAME : String 밑줄, 대문자
//	
//	필드의 접근 제한자
//	필드의 예약어
//	브랜드
//	public -> 본인, 같은 패키지, 후손, 전체
	public static String brand = "현대";
//	색깔
//	protected -> 본인, 같은 패키지, 후손
	protected String color;
//	가격
//	(default) -> 본인, 같은 패키지
	int price;
//	제조년도
//	private -> 본인
	private int year;
	
	
//	인스턴스 블록
	{year = 2024;}
//	클래스 블록(static 붙어있는 애들 초기화)
	static {brand = "폭스바겐";}
	
}
