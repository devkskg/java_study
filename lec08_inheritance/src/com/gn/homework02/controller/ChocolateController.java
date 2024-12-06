package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Chocolate;

public class ChocolateController {
	private Chocolate c = new Chocolate();
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		return "밀가루 : %.1f(g)" + flour + "\n"
				+ "크림 : %.1f(g)" + cream + "\n"
				+ "체리 : %d(개)" + cherry + "\n"
				+ "초콜릿 칩 : %d(개)" + chip;
	}
}
