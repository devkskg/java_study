package com.gn.practice03.model.vo;

public class Circle02 extends Point {
	private int radius;
	private static final double pi = 3.14;
	
	public Circle02() {}
	public Circle02(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
//		System.out.println("=== circle ===");
		System.out.println("(x, y) : (" + super.getX() + ", " + super.getY() + ")");
		System.out.printf("%s%.1f", "면적 : ", (pi * radius * radius));
		System.out.println();
		System.out.printf("%s%.1f", "둘레 : ", (2 * pi * radius));
		System.out.println();
	}
	

}
