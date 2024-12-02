package com.gn.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
//		1) 문제
//	아래 값을 활용해서 정수 배열을 구성하세요.
//	( -62, 107, -12, 89, -35 )
//	for each문을 사용하여 각 숫자를 확인하세요.
//	50을 넘는 숫자가 있다면 해당 숫자를 출력해주세요.
//	2) 출력 예시
//	107
//	89
		int[] arr = {-62, 107, -12, 89, -35};
		
		for(int num : arr) {
			if(num > 50) {
				System.out.println(num);
			}
		}
		
		
		int[] arr2 = new int[5];
		arr2[0] = -62;
		arr2[1] = 107;
		arr2[2] = -12;
		arr2[3] = 89;
		arr2[4] = -35;
		
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] > 50) {
				System.out.println(arr2[i]);
			}
		}
		
		
		int[] arr3 = new int[] {-62, 107, -12, 89, -35};
		for(int fiftyOver : arr3) {
			if(fiftyOver > 50) {
				System.out.println(fiftyOver);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int[] arr4 = new int[5];
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		arr4[0] = num1;
		arr4[1] = num2;
		arr4[2] = num3;
		arr4[3] = num4;
		arr4[4] = num5;
		
		for(int fiftyOver : arr4) {
			if(fiftyOver > 50) {
				System.out.println(fiftyOver);
			}
		}
		
		
		int[] arr5 = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		for(int fiftyOver : arr5) {
			if(fiftyOver > 50) {
				System.out.println(fiftyOver);
			}
		}
		sc.close();
		
		
}
}
