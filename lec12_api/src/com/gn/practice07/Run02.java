package com.gn.practice07;

public class Run02 {
	public static void main(String[] args) {
		double d = 5.13824;
		
		double d1 = Math.round(d * Math.pow(10, 1)) / Math.pow(10, 1);
		System.out.println("소수점 첫째자리까지 반올림 : " + d1);
		double d2 = Math.round(d * Math.pow(10, 2)) / Math.pow(10, 2);
		System.out.println("소수점 첫째자리까지 반올림 : " + d2);
		double d3 = Math.round(d * Math.pow(10, 3)) / Math.pow(10, 3);
		System.out.println("소수점 첫째자리까지 반올림 : " + d3);
	}
}
