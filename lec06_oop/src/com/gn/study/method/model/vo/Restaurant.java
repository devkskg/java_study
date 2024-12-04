package com.gn.study.method.model.vo;

public class Restaurant {
//	매개변수 연습을 위해 반환 없이 해보자(void 사용할거다.)
//	1. 매개변수X
//	-> 인사
	public void welcomMsg() {
		System.out.println("이랏샤이마세~!");
	}
//	2. 기본형 매개변수
//	-> 테이블 번호를 입력 받아서 출력
	public void setTableNumber(int tableNumber) {
		System.out.println("테이블 번호 " + tableNumber + "에 앉으세요~");
		return;
	}
//	3. 배열 매개변수
//	-> 주문 목록(배열)을 입력받아서 출력
	public void processOrder(String[] menuItems) {
		System.out.println("주문 한번 확인하겠습니다.");
		for(String item : menuItems) {
			System.out.println(item);
		}
	}
	
//	4. 클래스(객체) 매개변수 -> 음료수 셋팅
	public void sodaSetting(Soda s1) {
		System.out.println(s1.name + " 먼저 셋팅하겠습니다.");
	}

}
