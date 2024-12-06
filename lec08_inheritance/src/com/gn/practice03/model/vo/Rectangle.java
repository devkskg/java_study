package com.gn.practice03.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	private int x;
	private int y;
	
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw() {
//		System.out.println("=== circle ===");
		System.out.println("(x, y) : (" + x + ", " + y + ")");
		System.out.printf("%s%d", "면적 : ", (width * height));
		System.out.println();
		System.out.printf("%s%d", "둘레 : ", ((width + height) * 2));
		System.out.println();
	}
}
