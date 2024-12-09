package com.gn.study.controller;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println("===========");

//		List(ArrayList)
//		1. 선언과 생성 - 인터페이스를 참조변수로 써야 좋다! 다형성 때문에!
		List<String> list = new ArrayList<String>(); // Import 필수
//		2. 추가
		List<String> meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("점심");
		System.out.println(meal); // List는 이미 toString이 되어있다.
		meal.add(1, "아점");
//		meal.add(4, "야식 고?"); 인덱스 3번이 비워진 채로 4번 추가하려니까 IndexOutOfBoundsException 오류가 뜬다.
//		빈 공간 없게 해야된다!
//		3. 삭제
		System.out.println(meal);
//		meal.remove("간식"); 특정 데이터 쓰면 지울 수 있긴 하는데.. 비추비추.. 객체 들어가면 equals 재정의 하는거 아니면 판단 어렵다.
		meal.remove(1);
		System.out.println(meal);
		meal.clear();
		System.out.println(meal);
//		4. 요소 변경
//		meal.set(0, "ddd"); 비어있는 List에서 0번 요소변경은 안되는 구나 
//		System.out.println(meal); 
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(15);
		nums.add(10);
		nums.add(23);
		System.out.println(nums);
		nums.set(1, 112233);
		System.out.println(nums);
//		5. 요소 조회
		System.out.println(nums.get(2));
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(i + " : " + nums.get(i));
		}

		for (Integer n : nums) {
			System.out.println(n);
		}
		for (int n : nums) { // wrapper 형태의 데이터를 기본형 자료형으로 바꾸는 것 : Unboxing !!!!!
			System.out.println(n);
		}

	}
}
