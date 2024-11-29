package com.gn.practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
//		1) 문제
//	철수네 학교는 두발 검사가 있는 학교에요.
//	여학생은 귀밑 7cm, 남학생은 귀밑 3cm를 원칙으로 삼고 있어요.
//	학생의 성별과 머리 길이를 키보드로 입력 받아서
//	합격, 불합격 여부를 출력하는 프로그램을 만들어주세요.
//	여학생은 머리 길이가 7cm 이하이면 합격이고,
//	남학생은 3cm 이하이면 합격입니다.
//	2) 출력 예시
//	성별(F/M) : **F**		성별(F/M) : **M**
//	머리(cm) : **3**		머리(cm) : **20**
//	합격입니다.		  불합격입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(F/M) : ");
		char gender = sc.next().charAt(0);
		System.out.print("머리(cm) : ");
		char hairLength = sc.next().charAt(0);
		
		
		if(gender == 'M') {
			if(hairLength <= '3') {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			if(hairLength <= '7') {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		}

		sc.close();
		
	}

}
