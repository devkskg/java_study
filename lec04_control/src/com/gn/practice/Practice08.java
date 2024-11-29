package com.gn.practice;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
//		1) 문제
//	키보드로 정수를 하나 입력 받습니다.
//	출력받은 변수의 크기만큼 왼쪽으로 정렬된 삼각형을 출력하세요.
//	2) 참고
//	정수 : **4**
//	*
//	**
//	***
//	****
//	*****
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num+1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
