package com.gn.homework02.controller;

import com.gn.homework02.model.vo.GreenTea;

public class GreenTeaController {
	private GreenTea gt = new GreenTea();
	
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		return "밀가루 : " + flour + "(g)" + "\n"
				+ "크림 : " + cream + "(g)" + "\n"
				+ "녹차파우더 : " + powder + "(g)" + "\n"
				+ "치즈 큐브 : " + cheese +"(개)";
	}
}
