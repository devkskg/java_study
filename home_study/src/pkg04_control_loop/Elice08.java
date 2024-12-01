package pkg04_control_loop;

import java.util.Scanner;

public class Elice08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.print("(");
			for(int j = 1; j <= i; j++) {
				sum += j;;
				System.out.print(j);
				if(j < i) {
					System.out.print("+");
				} else {
					System.out.print(")");
				}
			}
			if(i < num) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.print(sum);
		sc.close();
		
		
	}
}
