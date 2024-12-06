package com.gn.practice03.run;

import com.gn.practice03.model.vo.Circle02;
import com.gn.practice03.model.vo.Rectangle02;

public class Run02 {
	public static void main(String[] args) {
		Circle02[] cArr = new Circle02[2];
		Rectangle02[] rArr = new Rectangle02[2];
		cArr[0] = new Circle02(1,2,3);
		cArr[1] = new Circle02(3,3,4);
		
		rArr[0] = new Rectangle02(-1, -2, 5, 2);
		rArr[1] = new Rectangle02(-2, 5, 2, 8);
		
		System.out.println("=== circle ===");
		for(Circle02 c : cArr) {
			c.draw();
		}
		System.out.println("=== Rectangle ===");
		for(Rectangle02 r : rArr) {
			r.draw();
		}
		
		
	}
}
