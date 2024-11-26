package com.gn.study;

public class VariableBasic {
//		 "main" -> ctl + space 하면 메인 메소드 만들기 쉽게 가능.
	public static void main(String[] args){
//		1. 변수 선언
		int number;
//		2. 변수 초기화
		int age;
		age = 100;
		int age2 = 100;
//		int age2 = 50;
//		{}중괄호 기준으로 같은 변수 선언하면 오류난다.
//		3. 변수 표준출력
		System.out.println(age);
		
//		4. 변수의 재할당
		int score = 90;
		System.out.println("1 : " + score);
		score = 95;
		System.out.println("2 : " + score);

	}

}
