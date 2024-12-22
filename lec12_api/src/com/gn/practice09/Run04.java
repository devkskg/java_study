package com.gn.practice09;

import java.util.Calendar;

public class Run04 {
	public static void main(String[] args) {
		Calendar firstDay = Calendar.getInstance();
		Calendar toDay = Calendar.getInstance();
		
		firstDay.set(2024, 1-1, 1);
		
		long firstMillis = firstDay.getTimeInMillis();
		long todayMillis = toDay.getTimeInMillis();
		
		long diff = (todayMillis - firstMillis) / (1000 * 60 * 60 * 24);
		
		System.out.println("연초부터 며칠이 자났나요? : " + diff);
		
		
		
	}
}
