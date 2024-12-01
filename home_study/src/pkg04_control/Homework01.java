package pkg04_control;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("");
//		int age = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		int price;
		
		if(age < 3) {
			price = 0;
			System.out.println("당신의 놀이동산 요금은 " + price + "원 입니다.");
		} else if(age < 13) {
			price = 10000;
			System.out.println("당신의 놀이동산 요금은 " + price + "원 입니다.");					
		} else if(age < 19) {
			price = 20000;
			System.out.println("당신의 놀이동산 요금은 " + price + "원 입니다.");					
		} else if(age < 65) {
			price = 30000;
			System.out.println("당신의 놀이동산 요금은 " + price + "원 입니다.");					
		} else {
			price = 0;
			System.out.println("당신의 놀이동산 요금은 " + price + "원 입니다.");					
		}
		
		sc.close();

	}

}
