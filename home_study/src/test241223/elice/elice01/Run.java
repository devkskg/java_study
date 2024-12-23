package test241223.elice.elice01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num < 0 || 100 < num) {
			System.out.println("점수입력오류");
		} else if(60 <= num) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		sc.close();
	}
}
