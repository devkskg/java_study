package com.gn.homework06.model.vo;

public class Rectangle {
	private int width;
	private int height;
	private int round;
	private int area;
	
	public Rectangle() {
		this(1, 1);
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		return round = (width * 2) + (height * 2);
	}
	public int calculateArea() {
		return area = (width * height);
	}
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("가로 : " + width  + "cm" + ", 세로 : " + height + "cm");
		System.out.println("1. 사각형의 둘레");
		System.out.println(round + "cm");
		System.out.println("2. 사각형의 넓이");
		System.out.println(area + "cm^2");
	}
	
}
