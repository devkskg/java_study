package pkg03_operator;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		String str = sc.next();
		
		String answer = "간다".equals(str) ? "온다" : "간다";
		
		System.out.println("앵무새 : " + answer);
		
		sc.close();

	}

}
