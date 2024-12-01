package pkg04_control_loop;

import java.util.Scanner;

public class Elice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
			if( (i % 2 == 0 && num % 2 ==0) || (i % 2 == 1 && num % 2 == 1) ) {
				sum += i++;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
