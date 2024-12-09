package com.gn.practice03.model.vo;

public class Circle extends Point {
	private int radius;
	private static final double pi = 3.14;
	
//	기본 생성자
	public Circle() {}
//	매개변수 생성자
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	
	@Override
	public void draw() {
//		System.out.println("=== circle ===");
//		System.out.println("(x, y) : (" + super.getX() + ", " + super.getY() + ")");
		super.draw();
//		System.out.printf("%s%.1f\n", "면적 : ", (pi * radius * radius)); // \n 넣는 센스
		System.out.printf("면적 : %.1f\n", (pi * radius * radius)); 
//		System.out.println();
		System.out.printf("%s%.1f", "둘레 : ", (2 * pi * radius));
		System.out.println();
	}
	
}
