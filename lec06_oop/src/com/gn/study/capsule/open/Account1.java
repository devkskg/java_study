package com.gn.study.capsule.open;

//	getter, setter 사용 x
public class Account1 {
	public String user; // 소유주
	public int balance; //잔액
	
//	기본 생성자
	public Account1() {}
	
//	매개 변수 생성자
	public Account1(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}
}
