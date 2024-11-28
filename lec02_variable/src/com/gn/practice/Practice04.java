package com.gn.practice;

public class Practice04 {

	public static void main(String[] args) {
//		1) 문제
//	아래의 변수들을 선언, 초기화하고 두 수를 더한 값을 아래와 같이 출력하는 프로그램을 구성하세요.
//	정수형 변수 num1에 10 할당
//	실수형 변수 num2에 5.7 할당
//	2) 출력 예시
//	정수 : 15
//	실수 : 15.7
		int num1 = 10;
		double num2 = 5.7;
		
		System.out.println("정수 : " + (int)(num1 + num2));
		System.out.println("정수 : " + (num1 + (int)num2));
		System.out.println("실수 : " + (num1 + num2));
		// 괄호가 없다면 문자열처럼 순서대로 나오게 된다. 정수 : 105.7 이런식으로!
		

	}

}
