package com.gn.study.constructor.model.vo;
//	초기화 우선순위
public class Cake {
	public String flavor = "명시적 초기화의 맛";
	public static int price = 1;
	
//	인스턴스 변수의 초기화 우선순위
	public Cake(){
		this.flavor = "생성자를 사용한 초기화의 맛";
//		this.price = 2; // static은 생성자를 위한 초기화는 없다고 생각하자.
//		클래스 내에 price가 있어서 오류가 뜨지는 않는다.
	}
	
	
	{flavor = "초기화 블록 사용한 초기화의 맛";}
	
//	public Cake() {
//		price = 3;
//	}
	
	
	static {price = 3;}
	
	
	
}
