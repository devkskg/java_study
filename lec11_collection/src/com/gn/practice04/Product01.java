package com.gn.practice04;

public class Product01 {
	private String name;
	private int price;
	public Product01() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product01(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "은(는) " + price + "원이에요.";
	}
	
}
