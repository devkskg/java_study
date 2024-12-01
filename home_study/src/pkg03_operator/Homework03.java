package pkg03_operator;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친구 수 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int quo = num2 / num1;
		int remain = num2 % num1;
		
		System.out.println("1인당 사탕 개수 : " + quo + "개");
		System.out.println("남은 사탕 개수 : " + remain + "개");
		
		sc.close();
		
	}

}
