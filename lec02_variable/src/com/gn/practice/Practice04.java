package com.gn.practice;

public class Practice04 {

	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 5.7;
		
		System.out.println("정수 : " + (int)(num1 + num2));
		System.out.println("정수 : " + (num1 + (int)num2));
		System.out.println("실수 : " + (num1 + num2));
		// 괄호가 없다면 문자열처럼 순서대로 나오게 된다. 정수 : 105.7 이런식으로!
		

	}

}
