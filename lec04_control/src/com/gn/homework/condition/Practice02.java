package com.gn.homework.condition;

import java.util.Scanner;

public class Practice02 {
	public void ptc02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 일기예보 ===");
		System.out.print("월 : ");
		int m = sc.nextInt();
		System.out.print("기온 : ");
		int t = sc.nextInt();
		
		if((1 <= m && m <=2) || m == 12) {
			System.out.print("겨울");
			if(t <= -15) {
				System.out.println(" 한파 경보");
			} else if(t <= -12) {
				System.out.println(" 한파 주의보");
			}
		} else if(3 <= m && m <= 5) {
			System.out.println("봄");
		} else if(6 <= m && m <= 8) {
			System.out.print("여름");
			if(t >= 35) {
				System.out.println(" 폭염 경보");
			} else if(t >= 33) {
				System.out.println(" 폭염 주의보");
			}
		} else if(9 <= m && m <= 11) {
			System.out.println("가을");
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}
		sc.close();
	}
}
