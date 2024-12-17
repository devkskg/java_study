package com.gn.practice07;

public class Run {
	public static void main(String[] args) {
		double num = 5.13824;

//		double num1 = Math.round(num * Math.pow(10, 1)) / Math.pow(10, 1);
		double num1 = Math.round(num * Math.pow(10, 1)) / Math.pow(10, 1);
		double num2 = Math.round(num * Math.pow(10, 2)) / Math.pow(10, 2);
		double num3 = Math.round(num * Math.pow(10, 3)) / Math.pow(10, 3);

		System.out.println("소수점 첫째자리까지 반올림 : " + num1);
		System.out.println("소수점 둘째자리까지 반올림 : " + num2);
		System.out.println("소수점 셋째자리까지 반올림 : " + num3);
	}
}
