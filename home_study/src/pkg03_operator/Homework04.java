package pkg03_operator;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kr = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.print("영어 : ");
		int en = sc.nextInt();
		
		int total = (kr + math + en);
		int average = (kr + math + en) / 3;
		
		String str = (kr >= 60 && math >= 60 && en >= 60 && average >=90)? "휴대폰을 바꿀 수 없습니다." : "휴대폰을 바꿀 수 없습니다.";
		
		System.out.println("합계: " + total + "점");
		System.out.println("평균: " + average + "점");
		System.out.println(str);
		
		sc.close();

	}

}
