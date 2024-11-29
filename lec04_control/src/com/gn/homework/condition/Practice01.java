package com.gn.homework.condition;

import java.util.Scanner;

public class Practice01 {

	public void ptc01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===놀이동산 입장료 계산하기===");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		int price = 0;
		
		if(age >= 65) {
			price = 0;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		} else if(age >= 19) {
			price = 30000;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		} else if(age >= 13) {
			price = 20000;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		} else if(age >= 3) {
			price = 10000;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		} else if(age < 3) {
			price = 0;
			System.out.println("당신의 놀이동산 요금은 " + price + "원입니다.");
		} else {
			System.out.println("잘못된 나이입니다.");
		}
		sc.close();
	}

}
