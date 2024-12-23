package test241223.elice.elice06;

import java.util.Scanner;

public class Run02 {
	public static void main(String[] args) {
//		강사님 풀이
//		이런 식으로 푼다
		Scanner sc = new Scanner(System.in);
		int animal = sc.nextInt();
		int leg = sc.nextInt();
		
		if(leg/4 <= animal && animal<= leg/2) { // 이 부분 중요!
			
		} else {
			System.out.println("계산 불가능");
		}
		sc.close();
	}
}
