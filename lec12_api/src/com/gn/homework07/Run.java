package com.gn.homework07;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이의 임의의 난수를 맞춰보세요.");

		int count = 0;
		int rd = (int) (Math.random() * 100) + 1;
//		System.out.println(rd);
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1 || 100 < num) {
				System.out.println("올바른 숫자를 입력해주세요.");
			} else if (num == rd) {
				System.out.println("정답입니다~");
				count++;
				break;
			} else if (num < rd) {
				System.out.println("업!");
				count++;
			} else if (num > rd) {
				System.out.println("다운!");
				count++;
			}

		}
		System.out.println(count + "회만에 맞추셨습니다.");
		sc.close();
	}
}
