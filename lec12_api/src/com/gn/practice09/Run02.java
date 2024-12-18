package com.gn.practice09;

import java.util.Calendar;

public class Run02 {
	public static void main(String[] args) {
		
		Calendar firstCal = Calendar.getInstance();
		firstCal.set(Calendar.YEAR, 2024);
		firstCal.set(Calendar.MONTH, 1-1);
		firstCal.set(Calendar.DAY_OF_MONTH, 1);
//		firstCal.set(2024, 1-1, 1);
		long firstMillies = firstCal.getTimeInMillis();
		
		Calendar nowCal = Calendar.getInstance();
		long nowMillies = nowCal.getTimeInMillis();
		
		long diff = nowMillies - firstMillies;
		diff = diff / (1000*60*60*24);
		
		System.out.println(diff + "일");
		
		
	}
}
