package com.gn.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getDayOfWeek().getValue());
		
		String str = "2024-12-25";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate tt = LocalDate.parse(str, dtf);
		System.out.println(tt.getYear());
		
		String str2 = "2024*12-31/";
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy*MM-dd/");
		LocalDate tt2 = LocalDate.parse(str2, dtf2);
		System.out.println(tt2);
		
		String str3 = "2011-1-8";
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-M-d");
		LocalDate tt3 = LocalDate.parse(str3, dtf3);
		System.out.println(tt3);
		
		String str4 = "4568-12-01";
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate tt4 = LocalDate.parse(str4, dtf4);
		System.out.println(tt4);
	}
}
