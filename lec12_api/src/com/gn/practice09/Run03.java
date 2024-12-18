package com.gn.practice09;

import java.util.Calendar;

public class Run03 {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(2024, 1-1, 1);
		
		long cal1Millis = cal1.getTimeInMillis();
		long cal2Millis = cal2.getTimeInMillis();
		
		long diff = cal2Millis - cal1Millis;
		diff = diff / (1000*60*60*24);
		System.out.println(diff + "일");
	}
}
