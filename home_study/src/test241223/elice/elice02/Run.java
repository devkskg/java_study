package test241223.elice.elice02;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int fhund = money / 500;
		System.out.println("500원:" + fhund + "개");
		money = money % 500;
		
		int hund = money / 100;
		System.out.println("100원:" + hund + "개");
		money = money % 100;
		
		int fifty = money / 50;
		System.out.println("50원:" + fifty + "개");
		money = money % 50;
		
		int ten = money / 10;
		System.out.println("10원:" + ten + "개");
		money = money % 10;
		
		int one = money / 1;
		System.out.println("1원:" + one + "개");
		
		sc.close();
		
	}
}
