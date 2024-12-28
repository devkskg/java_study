package com.gn.practice03.model.vo;

public class Vehicle02 {
	private int wheel;
	
	public Vehicle02() {}
	public Vehicle02(int wheel) {
		this.wheel = wheel;
	}
	
	public int getWheel() {
		return wheel;
	}
	
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	public void go() {
		System.out.println(" 지나가요~");
	}
}
