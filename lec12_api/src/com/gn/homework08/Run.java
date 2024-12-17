package com.gn.homework08;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소수점이 있는 숫자 : ");
		double dNum = sc.nextDouble();
		System.out.print("10의 제곱수 : ");
		int iNum = sc.nextInt();

		double result = (Math.round(dNum * Math.pow(10, iNum)) / Math.pow(10, iNum));
		System.out.println("반올림된 결과 : " + result);
		sc.close();
	}
}
