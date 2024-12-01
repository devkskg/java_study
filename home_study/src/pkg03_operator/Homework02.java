package pkg03_operator;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수 : ");
		int num = sc.nextInt();
		
		int remain = num % 2;
		
		String str = remain == 0? "짝수" : "홀수";
		
		System.out.println("구슬의 개수는 " + str + "입니다.");
		
		sc.close();

	}

}
