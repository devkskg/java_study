package com.gn.practice;

public class Practice05 {

	public static void main(String[] args) {
//		1) 문제
//	정수형 변수 i가 1일때부터 시작해서 9보다 작거나 같을 때까지 1씩 커지면서 반복합니다.
//	매 사이클에 i와 7을 곱한 값을 출력해서 예시와 같이 출력되는 프로그램을 만들어보세요.
//	2) 출력 예시
//	=== 7단 ===
//	7 * 1 = 7
//	7 * 2 = 14
//	7 * 3 = 21
//	7 * 4 = 28
//	7 * 5 = 35
//	7 * 6 = 42
//	7 * 7 = 49
//	7 * 8 = 56
//	7 * 9 = 63
		System.out.println("=== 7단 ===");
		for(int i = 1; i < 10; i++) {
			System.out.println("7 * " + i + " = " + (i * 7));
		}

	}

}
