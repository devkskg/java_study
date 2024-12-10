package com.gn.homework04.view;

import java.util.Scanner;

import com.gn.homework04.controller.NumberController;
import com.gn.homework04.exception.NumRangeException;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);
	
	NumberController nc = new NumberController();
	
	public void menu() {
		System.out.print("정수1 : ");
		int a = sc.nextInt();
		System.out.print("정수2 : ");
		int b = sc.nextInt();
		try {
			if(nc.checkDouble(a, b)) {
				System.out.println(a + "은(는) " + b + "의 배수인가? true");
			} else {
				System.out.println(a + "은(는) " + b + "의 배수인가? false");
			}
			
			
		} catch (NumRangeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
	}
}
