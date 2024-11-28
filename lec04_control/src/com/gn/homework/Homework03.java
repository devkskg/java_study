package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
//		문제
//		❓
//		사용자로부터 세 개의 정수를 입력 받아서, 삼항 연산자를 사용하여 세 수 중에서 가장 작은 수를 찾아서 출력하는 프로그램을 작성하세요. (중첩된 삼항 연산자를 사용하세요)
//		출력 예시
//		=== 세개의 정수 비교하기 ===
//		첫 번째 정수 : 123
//		두 번째 정수 : 875
//		세 번째 정수 : 37
//		세 수 중에서 가장 작은 수는 37입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int num3 = sc.nextInt();
		
		int small = num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
		
		System.out.println("세 수 중에서 가장 작은 수는 " + small + "입니다.");
		
		sc.close();

	}

}
