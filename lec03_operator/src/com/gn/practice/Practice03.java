package com.gn.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
//		1) 문제
//	두 개의 숫자를 입력 받으세요.
//	첫번째 숫자가 두번째 숫자보다 큰지 확인하는 프로그램을 만드세요.
//	결과는 boolean 타입값을 그대로 출력하세요.
//	비교 연산자를 활용해서 문제를 해결하세요.
//	2) 출력 예시
//	숫자(1) : **77**
//	숫자(2) : **44**
//	첫번째 숫자가 두번째 숫자보다 큰가요? true
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자(1) : ");
		int num1 = sc.nextInt();
		System.out.print("숫자(2) : ");
		int num2 = sc.nextInt();
		
		boolean compare = (num1 > num2);
		// 강사님께서는 변수 이름을 isFirstGTSecond라고 쓰셨음.
		// 같은 클래스 내에서 더 많은 비교(크다, 작다 등)를 위해 compare 보다 더 좋아 보임.
		
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가요? " + compare);
		
		sc.close();
		
	}

}
