package com.gn.practice;

public class Practice07 {

	public static void main(String[] args) {
//		1) 문제
//	2단부터 9단까지 구구단을 출력하는 프로그램을 만드세요.
//	아래와 같은 형식으로 9단까지 이어지게 만들어주세요.
//	2) 출력 예시
//	=== 2단 ===
//	2 * 1 = 2
//	2 * 2 = 4
//	2 * 3 = 6
//	2 * 4 = 8
//	2 * 5 = 10
//	2 * 6 = 12
//	2 * 7 = 14
//	2 * 8 = 16
//	2 * 9 = 18
//	=== 3단 ===
//	3 * 1 = 3
//	3 * 2 = 6
//	3 * 3 = 9
//	⋮
		for(int i = 2; i <= 9; i++) {
			System.out.println("===" + i + "단===");
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
		
		
		
	}

}
