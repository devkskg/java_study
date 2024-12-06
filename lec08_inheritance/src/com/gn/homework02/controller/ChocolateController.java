package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Chocolate;

public class ChocolateController {
	private Chocolate c = new Chocolate();
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		return "밀가루 : " + flour + "(g)" + "\n"
				+ "크림 :" + cream + "(g)" + "\n"
				+ "체리 : " + cherry + "(개)" + "\n"
				+ "초콜릿 칩 : " + chip + "(개)";
	}
}
