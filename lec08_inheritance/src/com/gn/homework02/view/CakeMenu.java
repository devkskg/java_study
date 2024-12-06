package com.gn.homework02.view;

import java.util.Scanner;

import com.gn.homework02.controller.ChocolateController;
import com.gn.homework02.controller.GreenTeaController;

public class CakeMenu {
	private Scanner sc = new Scanner(System.in);
	private ChocolateController cc = new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	public int num = 0;
	
	public void mainMenu() {
		System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
		System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
		System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
		System.out.println("9. 취소");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
	}
//			if(num == 1) {
//				
////				System.out.print("밀가루(g) : ");
////				int flour = sc.nextInt();
////				System.out.println("크림(g) : " );
////				int cream = sc.nextInt();
////				System.out.println("체리(개) : ");
////				int cherry = sc.nextInt();
////				System.out.println("초콜릿 칩(개) : ");
////				int chip = sc.nextInt();
////				cc.bakeChocolateCake(flour, cream, cherry, chip);
//			}
	public void chocolateMenu() {
		System.out.print("밀가루(g) : ");
		int flour = sc.nextInt();
		System.out.print("크림(g) : " );
		int cream = sc.nextInt();
		System.out.print("체리(개) : ");
		int cherry = sc.nextInt();
		System.out.print("초콜릿 칩(개) : ");
		int chip = sc.nextInt();
		System.out.println(cc.bakeChocolateCake(flour, cream, cherry, chip));
		System.out.println("초콜릿 케이크가 완성되었습니다.");
		
	}
	
	public void greenTeaMenu() {
		System.out.print("밀가루(g) : ");
		int flour = sc.nextInt();
		System.out.print("크림(g) : " );
		int cream = sc.nextInt();
		System.out.print("녹차파우더(g) : ");
		int powder = sc.nextInt();
		System.out.print("치즈큐브(개) : ");
		int cheese = sc.nextInt();
		System.out.print(gtc.bakeGreenTeaCake(flour, cream, powder, cheese));
		System.out.println("치즈 케이크가 완성되었습니다.");
		
		
	}
	
		
	}

