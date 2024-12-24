package com.gn.practice01;

import java.util.Scanner;

public class Run02 {
	public static void main(String[] args) {
		Practice p = new Practice();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
			try {
				System.out.println("합 : " + p.add(num1, num2));
				System.out.println("곱 : " + p.multiple(num1, num2));
				System.out.println("나누기 : " + p.divide(num1, num2));
			} catch (Exception e) {
				System.out.println("나누기 중 부적절한 연산이 발생했습니다.");
			} finally {
				System.out.println("마지막까지 잘 도착했어요!!");
			}
			sc.close();
	}
}
