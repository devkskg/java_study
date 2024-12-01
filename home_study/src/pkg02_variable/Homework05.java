package pkg02_variable;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kr = sc.nextInt();
		System.out.print("영어 : ");
		int en = sc.nextInt();
		System.out.print("수학 : ");
		int th = sc.nextInt();
		
		int total = (kr + en + th);
		int average = (kr + en + th) / 3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		sc.close();

	}

}
