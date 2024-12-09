package com.gn.homework01.model.vo;

public class Food extends Product {
	private int expirationDays;
	private int dc;

	public Food() {
	}

	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}

	public int getExpirationDays() {
		return expirationDays;
	}

	public int calculateDiscountRate() {

		if (expirationDays <= 1) {
			dc = 80;
		} else if (expirationDays <= 5) {
			dc = 50;
		} else if (expirationDays <= 10) {
			dc = 20;
		} else {
			dc = 0;
		}
		return dc;
	}

	@Override
	public int calculatePrice() {
		if (expirationDays <= 1) {
			dc = 80;
		} else if (expirationDays <= 5) {
			dc = 50;
		} else if (expirationDays <= 10) {
			dc = 20;
		} else {
			dc = 0;
		}
		return super.getPrice() * (100 - dc) / 100;
	}
}
