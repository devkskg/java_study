package com.gn.study.controller;

import com.gn.study.model.vo.Container;

public class Run {
	public static void main(String[] args) {
//		Boxing(기본형 -> 참조형)
		Integer iNum = 100;
		System.out.println(iNum);
//		Unboxing(참조형 -> 기본형)
		int num = iNum;
		System.out.println(iNum);
		System.out.println(num);

		System.out.println("===========");

//		parse메소드 - 문자열 형식의 값을 기본 타입으로 변환하는 메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1 + str2);
		int num1 = Integer.parseInt(str1);
//		System.out.println(num1);
		int num2 = Integer.parseInt(str2);
//		System.out.println(num2);
		System.out.println(num1 + num2);

		str2 = "1.34";
		System.out.println(str2 + str2);
		double num3 = Double.parseDouble(str2);
		System.out.println(num3 + num3);

		System.out.println("===========");

//		NumberFormatException
		try {
			String[] arr = new String[3];
			arr[0] = "일";

			int arrNum = Integer.parseInt(arr[0]);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열을 잡아주기 위해 try-catch 썼다.");
		System.out.println("===========");

//		ClassCastException
		try {
			Object o = 9;
			String oStr = (String) o;
//		Object-String / Object-Integer 할수는 있지만 String - Integer 끼리는 상속||구현 관계가 아니라서 예외!
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("선 넘은 형변환");
		System.out.println("===========");

//		제네릭
		Container<Integer> con = new Container<Integer>();
		con.setItem(50);

		Container<String> tain = new Container<String>();
		tain.setItem("안녕하세요.");
		System.out.println(con.getItem() + tain.getItem());

	}
}
