package pkg04_control;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어설계 점수:");
		int score1 = sc.nextInt();
		System.out.print("소프트웨어개발 점수:");
		int score2 = sc.nextInt();
		System.out.print("데이터베이스구축 점수:");
		int score4 = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수:");
		int score3 = sc.nextInt();
		System.out.print("정보시스템구축관리 점수:");
		int score5 = sc.nextInt();
		
		int total = (score1 + score2 + score3 + score4 + score5);
		int average = total / 5;
		
		if(score1 >= 40 && score2 >= 40 && score3 >= 40 && score4 >= 40 && score5 >= 40 && average >= 60) {
			System.out.println("평균 점수 : " + average);
			System.out.println("합격을 축하합니다.");
		} else if(average < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
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
		}
		
		sc.close();

	}

}
