package com.gn.homework01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		try {
			System.out.print("1~50사이의 숫자 : ");
			num = sc.nextInt();

		} catch (Exception e) {
//			e.printStackTrace();
		} finally {
			System.out.println(num);
			sc.close();
		}

	}
}
