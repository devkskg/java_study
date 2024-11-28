package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
//		철수는 오늘 가족들과 함께 놀이동산에 왔습니다. 
//		놀이동산은 총 5개의 연령으로 나누어 요금을 부여하고 있어요. 
//		
//		3살 미만은 무료, 
//		3세 ~ 12세는 10000원, 
//		13세 ~ 18세는 20000원, 
//		19세 ~ 64세는 30000원, 
//		65세 이상은 무료 입니다. 
//		
//		나이를 입력하면 요금을 출력하는 시스템을 만드세요. 
//		(if ~ else if ~ else 문을 사용하세요)
//		
//		출력 예시
//		=== 놀이동상 입장료 계산하기===
//		나이 : 35
//		당신의 놀이동산 요금은 30000원입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 놀이동상 입장료 계산하기===");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		int price;
		
		if(age < 3) {
			price = 0;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		} else if(age < 13) {
			price = 10000;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		} else if(age < 19) {
			price = 20000;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		} else if(age < 65) {
			price = 30000;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		} else {
			price = 0;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		}
		
		sc.close();
		
	}

}
