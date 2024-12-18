package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run02 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.WEEK_OF_MONTH, 1);
		Date d1 = c1.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(d1));
		
		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.MONTH, 1);
		Date d2 = c2.getTime();
		System.out.println(sdf.format(d2));
		
	}
}
