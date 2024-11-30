package com.gn.homework.loop;

import java.util.Scanner;

public class Practice07 {
	public void ptc07() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int i = 1;
		
		if(num<=0) {
			System.out.println("양수가 아닙니다.");
			System.out.println("다시 입력하세요. 정수 : ");
			num = sc.nextInt();
		} else {
			while(i <= num) {
//				if(num <= 0) {
//				} else {
					if(i % 2 == 1) {
						System.out.print("박");
						i++;
					} else {
						System.out.print("수");
						i++;
					}
					
//				}
				
			}
		}
//		if(num > 0) {
//			for(int j = 1; j <= num; j++) {
//				if(j % 2 == 1) {
//					System.out.print("박");
//					} else {
//					System.out.print("수");
//					}
//				}
//			} else {
//				System.out.println("양수가 아닙니다.");
//				System.out.println("다시 입력하세요. 정수 : ");
//				num = sc.nextInt();
//			}
//		
		sc.close();
	}


}
