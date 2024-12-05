package com.gn.practice07;

public class Supplement {
	private String name;
	private int num;
	private int price;
	
	public Supplement() {}
	
	public Supplement(String name, int num, int price) {
		this.name = name;
		this.num = num;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public int getPrice() {
		return price;
	}
	
	public void list() {
		System.out.println("이름: " + name + ", 복용량: " + num + "알, 가격: " + price + "원");
	}
	
}
