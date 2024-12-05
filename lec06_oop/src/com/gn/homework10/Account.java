package com.gn.homework10;

public class Account {
	private String accountNumber;
	private int balance;
	
	public Account() {}
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance -= amount;
		System.out.println(accountNumber + " 계좌에서 " + amount + "원 입금");
	}
	public void withdaw(int amount) {
		balance += amount;
		System.out.println(accountNumber + " 계좌에서 " + amount + "원 출금");
	}
	
	
}
