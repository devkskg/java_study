package com.gn.practice03.model.vo;

public class Bicycle extends Vehicle {
	@Override
	public void go() {
		System.out.print("다리힘으로");
//		super 써도 굿
	}
	
	public void gogogo() {
		System.out.println("고고고!");
	}
}
