package com.gn.study.capsule.closed;

//getter, setter 사용 o
public class Account2 {
	private String user; // 소유주
	private int balance; //잔액
	
//	기본 생성자
	public Account2() {}
	
//	매개 변수 생성자
	public Account2(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
//	getter, setter를 이용하여 캡슐화를 통한 보호.
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("출금이 불가능합니다.");
		} else {
			this.balance = balance;
		}
	}
	
	
	
	
}
