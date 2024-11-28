package com.gn.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("true 또는 false 입력 : ");
		boolean bool = sc.nextBoolean();
		System.out.println(!bool);
		
		sc.close();

	}

}
