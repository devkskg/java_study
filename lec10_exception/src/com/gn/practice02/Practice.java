package com.gn.practice02;

public class Practice {

//	강사님의 풀이
//	반환값이 뭔지 알 수 없는 상황이니까 기본값인 void를 사용해서 한 것

	public void printStrLength(String str) {
		try {
			str.length();
		} catch (Exception e) {
			System.out.println("NullPointerException 발생: " + e.getMessage());

		}
	}

//	public int printStrLength(String str) {
//		int a = 0;
//		try {
//			a = str.length();
//		} catch (Exception e) {
//			System.out.print("NullPointerException 발생: ");
//			System.out.println(e.getMessage());
//		}
//		return a;
//	}

//	public int printStrLength(String str) {
//		return str.length();
//	}
}
