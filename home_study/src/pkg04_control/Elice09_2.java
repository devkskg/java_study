package pkg04_control;

import java.util.Scanner;

public class Elice09_2 {

	public static void main(String[] args) {
		
		// 문제 잘못보고 정삼각형 만들어버렸음.
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		
		for(int i = 1; i <= h; i++) {
			int space = h - i;
			for(int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
			sc.close();
		}
	}

}
//3   *   
//2  * *  
//1 * * * 
//0* * * *