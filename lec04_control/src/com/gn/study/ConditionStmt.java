package com.gn.study;

public class ConditionStmt {

	public static void main(String[] args) {
//		Stmt 는 Statement의 줄임말
//		1. if 문
		int number = 10;
		if(number > 5) {
			int su = 2;
			System.out.println("number는 5보다 큽니다.");
			System.out.println(su);
		} 
//		 System.out.println(su); //su는 지역변수이므로 중괄호 밖에서는 사용할 수 없다.
		
//		2. if~else문
		int num = -3;
		if(num > 0) {
			// 양수
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
//		3. if~else if ~else문
		int a = 3;
		if(a >= 9) {
			System.out.println("9이상");
		} else if(a >= 6) {
			System.out.println("9미만 && 6이상");
		} else if(a >= 3) {
			System.out.println("9미만 && 6미만 && 3이상");
		} else {
			System.out.println("3미만");
		}
//		이부분 놓치고 있던 부분이라 잘 기억해 둬야함.
		
		
//		4. 중첩 if문
//		변수의 값이 양수 vs 음수
//		양수 -> 짝수 vs 홀수
		int target = -5;
		if(target > 0) {
//			양수
			if(target % 2 == 0) {
//				짝수
			} else {
//				홀수
			}
		} else if(target < 0) {
//			음수
		} else {
//			0
		}
		
		
		
		
		
		
		
		
	}

}
