package pkg04_control_loop;

import java.util.Scanner;

public class Practice02 {
	public void ptc02() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(1 <= num || num <= 9) {
			for(int i = num; i <= 9; i++) {
				System.out.println("=== " + i + "단 ===");
				
				for(int j= 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
				
			}
		} else if(num < 1){
			System.out.println("양수를 입력해주세요.");
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
		sc.close();
	}

}
