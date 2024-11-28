package com.gn.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
//		1) 문제
//	아래 코드에 복합 대입 연산자를 빈칸에 채워주세요.
//	이클립스 콘솔창에 출력되는 값은 우측 주석과 같아야 합니다.
//	int result = 100;
//	result ( 빈칸 )
//	System.out.println(result); //103
//	result ( 빈칸 )
//	System.out.println(result); //93
//	result ( 빈칸 )
//	System.out.println(result); //186
//	result ( 빈칸 )
//	System.out.println(result); //62
//	result ( 빈칸 )
//	System.out.println(result); //2
		int result = 100;
		result += 3;
		System.out.println(result); //103
		result -= 10;
		System.out.println(result); //93
		result *= 2;
		System.out.println(result); //186
		result /= 3;
		System.out.println(result); //62
		result %= 3;
		System.out.println(result); //2
		
		System.out.println();
		
		System.out.print("입력 숫자 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n += 3;
		System.out.println(n); //103
		n -= 10;
		System.out.println(n); //93
		n *= 2;
		System.out.println(n); //186
		n /= 3;
		System.out.println(n); //62
		n %= 3;
		System.out.println(n); //2
		sc.close();
		
//		홀수, 짝수
//		1,3,5... -> 2로 나눴을 때 나머지 1
//		2,4,6... -> 2로 나눴을 때 나머지 0
		
	}

}
