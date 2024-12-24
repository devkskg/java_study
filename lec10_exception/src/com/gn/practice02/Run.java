package com.gn.practice02;

public class Run {
	public static void main(String[] args) {
		Practice02 p = new Practice02();
		p.printStrLength(null);
//		try {
//			p.printStrLength(null);
//		} catch (NullPointerException e) {
//			System.out.print("NullPointerException 발생: ");
//			System.out.println(e.getMessage()); // getMessage return 있어서 출력과 함께
//			System.out.println(e); // toString 변수명?클래스명?으로 바로 받을 수 있어서 출력과 함께(toStirng생략)
//			e.printStackTrace(); // 이게 제일 무난무난하고 좋은듯?
//		}
	}
}
