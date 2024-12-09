package com.gn.study.model.vo;

//	추상 클래서 ( 추상 메소드가 하나라도 있으면 무조건 추상 클래스! )
public abstract class Animal {
//	추상 메소드 ( abstract , 중괄호x , 매개변수는 사용 유무에 따라 사용)
	public abstract void sound();
	
//	추상 메소드가 아니여도 있어도 된다.
	public void breath() {
		System.out.println("동물은 숨을 쉽니다.");
	}
}
