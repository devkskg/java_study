package pkg04_control;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		
		if(month == 1 || month == 2 || month == 12) {
			System.out.print("겨울");
			if(temp <= -15) {
				System.out.print(" 한파 경보");
			} else if(temp <= -12) {
				System.out.print(" 한파 주의보");
			}
		} else if(3 <= month && month <= 5) {
			System.out.print("봄");
		} else if(6 <= month && month <= 8) {
			System.out.print("여름");
			if(temp >= 35) {
				System.out.print(" 폭염 경보");
			} else if(temp >= 33) {
				System.out.print(" 폭염 주의보");
			}
		} else if(9 <= month && month <= 11) {
			System.out.print("가을");
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}
		
		sc.close();

	}

}
