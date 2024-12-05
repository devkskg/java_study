package com.gn.homework06.controller;

import com.gn.homework06.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.calculateArea();
		rec1.calculateRound();
		rec1.printInfo();
		
		Rectangle rec2 = new Rectangle(3, 5);
		rec2.calculateArea();
		rec2.calculateRound();
		rec2.printInfo();
		
		
	}
}
