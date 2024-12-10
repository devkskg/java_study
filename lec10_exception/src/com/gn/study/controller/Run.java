package com.gn.study.controller;

import com.gn.study.model.vo.Calculator;
import com.gn.study.model.vo.User;

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

		System.out.println("=========== 배열 조심 ===========");

		int[] numbers = { 1, 2, 3 };
//		System.out.println(numbers[3]);

		try {
			System.out.println(numbers[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 초과한 인덱스를 쓰셨네요!");
			System.out.println(e);
			e.printStackTrace();
			System.out.print("e.printStackTrace 설명 후에도 진행이 되는가? : ");
		} finally {
			System.out.println("네 됩니다!");
		}
		System.out.println("진짜 된다니까요!");

		Calculator c = new Calculator();
		c.divide(3, 0); // print로 받든 말든 printStacTrace는 return값이 아니라서 콘솔창에 잘 보인다!!
//		System.out.println("===========");
//		System.out.println(c.divide(3, 0));
		System.out.println("======================");
		User u = new User();
//		try {
//			u.checkAge(18);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//
////		throws를 통해 User -> Run으로 예외가 넘어왔음 그래서 여기서 try-catch로 해결해주자.
////		원래는 예외가 발생할 코드에 try-catch를 써야 옳지만 throws를 통해 다른 곳에서 해결하고자 할 때!
//		try {
//			u.nameLength(null);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("확인!");
//		
//		이런 식으로 throws를 통해 예외 처리를 한번에 할수도있다!
//		일단 아래 코드는 예시적으로 보여준 것이지 checkAge에서 오류 떠버리면 nameLength를 확인하지 못하니 문제다
//		Override처럼 다음 클래스로 넘겨버리는 느낌
		try {
			u.checkAge(14);
			u.nameLength(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("확인!");

	}
}
