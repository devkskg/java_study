package pkg04_control_loop;

import java.util.Scanner;

public class Elice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); // 전체 개체수
		int legs = sc.nextInt(); // 전체 다리수
		
		if(legs % 2 == 1 || legs > 4 * count || legs < 2 * count) {
			System.out.println("계산불가");
		} else {
			int x = (legs - 2 * count) / 2; // 강아지 개체수
			int y = count - x; // 병아리 개체수
			
			if(x >= 0 && y >= 0) {
				System.out.println(x + " " + y);
			} else {
				System.out.println("계산불가");
			}
		}
		
		
		sc.close();
		
	}

}
