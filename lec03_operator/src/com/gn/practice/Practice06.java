package com.gn.practice;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
//		1) 문제
//	사용자로부터 두 개의 정수를 입력 받습니다.
//	삼항 연산자를 사용해서 두 수중에서 작은 수를 찾아서 출력하세요.
//	2) 출력 예시
//	첫번째 : **4**
//	두번째 : **57**
//	두 수 중에서 작은 수는? 4
//	3) 더해보기
//	사용자로부터 3개의 정수를 입력 받으세요.
//	중첩 삼항 연산자를 사용해서 세 개의 정수 중에서 가장 큰 수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		
		int small = num1 < num2 ? num1 : num2;
		System.out.println("두 수 중에서 작은 수는? " + small);

		
		
		System.out.print("세번째 : ");
		int num3 = sc.nextInt();
		
		int big = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		System.out.println("세 수 중에서 큰 수는? " + big);
		
		
		sc.close();
		
	}

}
