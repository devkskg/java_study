package com.gn.homework01;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		int rd = (int) (Math.random() * 50) + 1;
		System.out.println(rd);
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("1~50사이의 숫자 : ");

		while (rd != num) {

			try {
				num = sc.nextInt();
				if (1 <= num && num <= 50) {
					if (rd == num) {
						break;
					} else if (rd < num) {
						System.out.println("Down!");
					} else if (rd > num) {
						System.out.println("Up!");
					}
				} else if (num < 1 || 50 < num) {
					System.out.println("범위 안의 숫자 입력 필요 : ");
				} else {
//					throw new Exception("범위 안의 숫자 입력 필요 : ");
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {

//				if (1 <= num && num <= 50) {
//					if (rd == num) {
//						break;
//					} else if (rd < num) {
//						System.out.println("Down!");
//					} else if (rd > num) {
//						System.out.println("Up!");
//					}
//				} else if (num < 1 || 50 < num) {
//					System.out.println("범위 안의 숫자 입력 필요 : ");
//				}
			}

		}
		sc.close();

		System.out.println("축하합니다~ 정답이에요");
	}
}
