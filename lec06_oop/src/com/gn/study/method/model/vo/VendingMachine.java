package com.gn.study.method.model.vo;

public class VendingMachine {
//	1. 인사
	public void sayHi() { // <- 메소드의 선언부 / 반환return 값이 없어서 void 사용?
		System.out.println("환영합니다~"); // <- 동작 정의
//		return; // void지만 return만 써도 괜찮다. 끝났다 끝낸다 이런 뜻으로 사용.
	}
//	2. 남아있는 잔돈(기본형) 리턴
	public int getBalance() { // return 값이 정수형이여서 int 사용
//		int balance = 500;
//		return balance; // void가 아니므로 반드시 return 필요
		return 500; // 이렇게 그냥 해버려도 괜찮다.
	}
//	3. 음료수 종류(배열) 리턴
	public String[] sodaList() {
//		String[] arr = new String[] {"콜라", "사이다", "오렌지 주스"};
//		return arr;
		return new String[] {"콜라", "사이다", "오렌지 주스"}; // 위 처럼 써도 괜찮다.
	}
//	Soda s1 = new Soda();
//	int balance = 500;
//	4. 선택된 음료수 객체(클래스) 리턴
	public Soda selectedSoda() {
//		Soda s1 = new Soda();
//		return s1;
		return new Soda(); // 이상해 보이지만 이렇게도 쓸 수 있다.
	}
}
