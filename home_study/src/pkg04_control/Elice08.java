package pkg04_control;

import java.util.Scanner;

public class Elice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int fac = 0;
		
		for(int i = 1; i <= num; i++) {
			
			sum += i;
			fac += sum;
			
			System.out.print("(");
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
				if(j < i) {
					System.out.print("+");
				} 
			} 
			System.out.print(")");
			
			if(i < num) {
				System.out.print("+");
			}
		}
		System.out.print("=" + fac);
		sc.close();
				
	}
}
//		for(int j = i; j <= num; j++) {
//			if(j == 1) {
//				System.out.println("(1)+");
//				System.out.println("(" + j);
//			} else if(j < num) {
//				System.out.println("+" + j);
//			} else {
//				System.out.println("+" + j);
//			}
//		}
