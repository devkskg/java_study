package com.gn.practice01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Practice ptc = new Practice();
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		String num1 = sc.next();
		System.out.print("num2 입력 : ");
		String num2 = sc.next();

		try {
			ptc.printSum(num1, num2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}
}
