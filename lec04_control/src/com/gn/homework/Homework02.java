package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
//		철수는 월과 기온을 입력하면 계절과 주의보/경보를 출력해주는 프로그램을 구성하려고 합니다. 
		
//		겨울은 1월, 2월, 12월이며 기온이 -15도 이하이면 한파 경보이고, 
//		-12 이하이면 한파 주의보입니다. 
		
//		3,4,5월은 봄이고, 
		
//		6,7,8월은 여름, 
		
//		9,10,11월은 가을입니다. 
//		
//		여름에 기온이 35도 이상이 되면 폭염 경보, 
//		33도 이상이면 폭염 주의보입니다. 
//		
//		만일 1~12월 사이가 아닌 월을 입력하면 해당하는 계절이 없다고 알려주세요. 
//		
//		(중첩된 if~else if~else문을 사용하세요)
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 일기예보 ===");
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		
//		if(month <= 2 || month == 12) {
//			System.out.print("겨울");
//			if(temp <= -15) {
//				System.out.println(" 한파 주의보");
//			}
//		} 
		if(month < 1 || 12 < month) {
			System.out.println("해당하는 계절이 없습니다.");
		} else if(3 <= month && month <= 5) {
			System.out.println("봄");
		} else if(6 <= month && month <= 8) {
			System.out.print("여름");
			if(temp >= 35) {
				System.out.println(" 폭염 경보");
			} else if(temp >= 33) {
				System.out.println(" 폭염 주의보");
			}
		} else if(9 <= month && month <= 11) {
			System.out.println("가을");
		} else if(month <= 2 || month == 12) {
			System.out.print("겨울");
			if(temp <= -15) {
				System.out.println(" 한파 주의보");
			}
		}
		
		sc.close();

	}

}
