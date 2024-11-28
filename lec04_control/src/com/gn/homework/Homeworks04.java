package com.gn.homework;

import java.util.Scanner;

public class Homeworks04 {

	public static void main(String[] args) {
//		합격인가? 불합격인가?
//				문제
//				❓
//				철수는 개발자가 되기 위해서 열심히 공부하고 있습니다. 
//		최근 정보처리기사 필기 시험을 쳤는데요. 
//		
//		정보처리기사 필기 시험 과목은 아래 5개이고, 
//		필기 시험에 합격하기 위해서는 각 과목의 점수가 40점 이상이면서, 
//		전체 평균이 60점 이상이어야 합니다. 
//		
//		각 상황별로 아래와 같이 출력되도록 구성해주세요. 
//		합격했을 경우 과목별 점수와 평균 
//		그리고 “축하합니다.”라는 문구를 출력하고,
//		불합격인 경우 불합격의 이유를 출력해주세요.
//				합격인 경우 
//				합격을 축하합니다.
//				평균 미달로 불합격인 경우
//				평균 점수 60점 미만으로 불합격입니다.
//				과락 과목이 있는 경우
//				데이터베이스 구축 과목 과락으로 불합격입니다.
//				(if~else if~else문을 사용하세요.)
//				출력 예시
//				=== 합격인가? 불합격인가? ===
//				각 과목의 점수를 입력하세요.
//				소프트웨어설계 점수: 73
//				소프트웨어개발 점수: 51
//				데이터베이스구축 점수: 65
//				프로그래밍언어활용 점수: 80
//				정보시스템구축관리 점수: 42
//				합격을 축하합니다!
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 합격인가? 불합격인가? ===");
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int score1 = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int score2 = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int score3 = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int score4 = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int score5 = sc.nextInt();
		
		int average = (score1 + score2 + score3 + score4 + score5) / 5;
		
		if(score1 >= 40 && score2 >= 40 && score3 >= 40 && score4 >= 40 && score5 >= 40 && 60 <= average) {
			System.out.println("합격을 축하합니다!");
		} else if(score1 < 40) {
			System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		} else if(score2 < 40) {
			System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		} else if(score3 < 40) {
			System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		} else if(score4 < 40) {
			System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		} else if(score5 < 40) {
			System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
		} else if(average < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		}
		
		sc.close();

	}

}
