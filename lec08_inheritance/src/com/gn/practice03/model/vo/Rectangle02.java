package com.gn.practice03.model.vo;

public class Rectangle02 extends Point {
	private int width;
	private int height;
	
	public Rectangle02() {}
	public Rectangle02(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		System.out.println("(x, y) : (" + super.getX() + ", " + super.getY() + ")");
		System.out.printf("%s%d", "면적 : ", (width * height));
		System.out.println();
		System.out.printf("%s%d", "둘레 : ", ((width + height) * 2));
		System.out.println();
	}
}
