package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		double weight = sc.nextDouble();
		
		System.out.print("키(m) : ");
		double height = sc.nextDouble()*1000/1000.0;
		
		double bmi = Math.round(weight / (height * height) * 10)/10.0;
		System.out.println(bmi);
		
		sc.close();
		
	}

}
