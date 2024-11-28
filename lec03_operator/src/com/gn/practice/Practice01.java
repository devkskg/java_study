package com.gn.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
//		1) 문제
//	철수는 오늘 학교에서
//	산술 연산자 +, -, *, /, %에 대해서 배웠습니다.
//	두 개의 정수를 키보드로 입력 받고,
//	다섯가지 산술 연산을 하여
//	결과를 출력해주는 계산기를 만들어주세요.
//	2) 출력
//	첫번째 숫자: **20**
//	두번째 숫자: **3**
//	덧셈 : 23
//	뺄셈 : 17
//	곱셈 : 60
//	몫 : 6
//	나머지 : 2
		System.out.println("계산기ver.01");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 입력 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 입력 숫자 : ");
		int num2 = sc.nextInt();
//		이거 위에 잘 안쓰던 거라서 다시 보면 좋을 거 같아.
		System.out.println("덧셈 : " + (num1 + num2));
		System.out.println("뺄셈 : " + (num1 - num2));
		System.out.println("곱셈 : " + (num1 * num2));
		System.out.println("몫 : " + (num1 / num2));
		System.out.println("나머지 : " + (num1 % num2));
		
		System.out.println();
		
		System.out.println("계산기ver.02");
		System.out.println("첫 번째 입력 숫자 : " + num1 + ", 두 번째 입력 숫자 : " + num2);
		int additon = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		int quotiont = num1 / num2;
		int remainer = num1 % num2;
		
		System.out.println("덧셈 : " + additon);
		System.out.println("뺄셈 : " + subtraction);
		System.out.println("곱셈 : " + multiplication);
		System.out.println("몫 : " + quotiont);
		System.out.println("나머지 : " + remainer);
		
		
		sc.close();

	}

}
