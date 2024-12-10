package com.gn.study.controller;

public class Run {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
//		int c = 1;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안돼요!!");
			System.out.println(e);
		} finally {
			System.out.println("계산 끝!");
		}

//		try {
////			System.out.println(a / c);
//			System.out.println(a - b);
//			System.out.println(a / b);
//			System.out.println("계산 끝!!");
//		} catch (ArithmeticException e) {
//			System.out.println("계산 불가");
//		}

		System.out.println("=========== Null 조심 ===========");

		String[] arr = new String[3];
		try {
			System.out.println(arr[0].length());
		} catch (NullPointerException e) {
			System.out.println("오류 발생!!!");
		}
//		arr[0] = "";
//		System.out.println(arr[0].length()); // System.out.println(null.length()); 이거랑 같은 말이다.

	}
}
