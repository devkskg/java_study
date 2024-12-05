package com.gn.homework10;

public class Main {

	public static void main(String[] args) {
		Account a = new Account("123-456-789", 100000);
		Account b = new Account("987-654-321", 50000);
		
		System.out.println("계좌번호가 \"" + a.getAccountNumber() + "\"이고, 잔액이 " + a.getBalance() + "원인 계좌 생성");
		System.out.println("계좌번호가 \"" + b.getAccountNumber() + "\"이고, 잔액이 " + b.getBalance() + "원인 계좌 생성");
		
		a.deposit(30000);
		b.withdaw(100000);
		
		System.out.println("계좌 번호 : " + a.getAccountNumber() + ", 잔액 : " + a.getBalance());
		System.out.println("계좌 번호 : " + b.getAccountNumber() + ", 잔액 : " + b.getBalance());
	}

}
