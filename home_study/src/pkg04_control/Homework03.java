package pkg04_control;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int num3 = sc.nextInt();
		
		int small = num1 < num2 ? (num1 < num3? num1 : num3) : (num2 < num3? num2 : num3);
		
		System.out.println("세 수 중에서 가장 작은 수는 " + small + "입니다.");

		sc.close();
		
	}

}