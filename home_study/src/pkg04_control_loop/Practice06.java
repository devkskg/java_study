package pkg04_control_loop;

import java.util.Scanner;

public class Practice06 {
	public void ptc06() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단의 트리를 만들까요? : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= dan; i++) {
			int h = dan - i;
			for(int j = 1; j <= h; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
			
		}
		sc.close();
	}

}