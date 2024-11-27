package com.gn.homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kr = sc.nextInt();
		System.out.print("영어 : ");
		int en = sc.nextInt();
		System.out.print("국어 : ");
		int mth = sc.nextInt();
		
		int total = kr + en + mth;
		int average = (kr + en + mth) / 3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		sc.close();
		
	}

}
