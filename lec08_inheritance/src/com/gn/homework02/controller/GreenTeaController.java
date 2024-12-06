package com.gn.homework02.controller;

import com.gn.homework02.model.vo.GreenTea;

public class GreenTeaController {
	private GreenTea gt = new GreenTea();
	
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		return "밀가루 : %.1f(g)" + flour + "\n"
				+ "크림 : %.1f(g)" + cream + "\n"
				+ "녹차파우더 : %d(g)" + powder + "\n"
				+ "치즈 큐브 : %d(개)" + cheese;
	}
}
