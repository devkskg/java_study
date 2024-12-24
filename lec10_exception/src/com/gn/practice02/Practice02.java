package com.gn.practice02;

public class Practice02 {
	public int printStrLength(String str) {
		try {
			return str.length();
		} catch (Exception e) {
			System.out.println("NullPointerException 발생: " + e.getMessage());
		}
		return 0;
	}
}
