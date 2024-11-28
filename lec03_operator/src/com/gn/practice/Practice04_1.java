package com.gn.practice;

import java.util.Scanner;

public class Practice04_1 {

	public static void main(String[] args) {
//		이니셜 "Cheolsu" 맞으신가요?
//		아니요 "Chulsu" 입니다.
//		혹시 "30"대 이신가요?
//		"23"살입니다.
		
		
//		1) 문제
//	철수가 여권을 만들려고 합니다.
//	철수가 입력한 이니셜과
//	여권 발급 금액 할인 행사에 참고하기 위해 20대인지 확인을 하고자 합니다.
//	키보드로 철수의 영어 이름과 나이 정보를 입력 받으세요.
//	그리고, 3가지 논리형 데이터를 출력하세요.
//	2) 출력 예시
//	이름 : **Chulsu**
//	나이 : **34**
//	(1) 영어 이름이 일치하나요? true
//	(2) 20대인가요? false
//	(3) 영어 이름이 일치하면서 동시에 20대인가요? false
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String enName = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		boolean nameBool = enName.equals("Chulsu");
//		boolean nameBool = "Chulsu".equals(enName); // 똑같다.
		boolean ageBool = (20 <= age) && (age < 30);
		boolean resultBool = nameBool && ageBool;
		
		System.out.println("(1) 영어 이름이 일치하나요? " + nameBool);
		System.out.println("(2) 20대 인가요? " + ageBool);
		System.out.println("(3) 영어 이름이 일치하면서 동시에 20대인가요? " + resultBool);
		
		sc.close();
		
	}

}
