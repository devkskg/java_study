package com.gn.practice09;

import java.util.Calendar;

public class Run {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.set(2024, 1 - 1, 1);
		long diff = c2.getTimeInMillis() - c1.getTimeInMillis();
		long days = diff / (1000 * 60 * 60 * 24);
		System.out.println(days);
	}
}
